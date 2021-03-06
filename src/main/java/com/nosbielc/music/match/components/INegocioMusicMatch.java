package com.nosbielc.music.match.components;

import com.nosbielc.music.match.dtos.*;
import com.nosbielc.music.match.entities.MusicMatch;
import com.nosbielc.music.match.entities.Solicitacao;
import com.nosbielc.music.match.response.Response;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface INegocioMusicMatch {

    Optional<OpenWeatherDto> buscarTemperaturaDaCidade(String cidade);

    Optional<OpenWeatherDto> buscarTemperaturaDaCidadePorCoordenadas(Double lat, Double lon);

    Optional<MusicMatch> buscarMusicMatchPorTemperatura(Integer temperatura);

    Optional<SpotifyOauthDto> pegaTokenSpotify();

    Optional<SpotifyPlayListDto> pegaPlayListDaCategoria(String token, String categoria);

    Optional<SpotifyTracksDto> pegaMusicasDaPlayList(String token, String idPlayList, String limit);

    List<TrackDto> spotifyTracksDtoToListTrackDto(SpotifyTracksDto spotifyTracksDto);

    Response<List<TrackDto>> executaMusicMatch(String cidade, Double lat, Double lon);

    SolicitacaoDto parseSolicitacaoDto(Solicitacao solicitacao);

    Response<Page<SolicitacaoDto>> listarSolicitacoes(Integer pag,
                                                      String ord,
                                                      String dir);

}
