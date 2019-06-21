package com.tencent.mm.compatible.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class r
{
  public static boolean a(String paramString, o paramo, c paramc, b paramb, k paramk, x paramx, ac paramac, s params, w paramw, aa paramaa, v paramv1, a parama, v paramv2)
  {
    AppMethodBeat.i(92991);
    try
    {
      ab.d("MicroMsg.DeviceInfoParser", "xml: ".concat(String.valueOf(paramString)));
      Map localMap = br.z(paramString, "deviceinfoconfig");
      if (localMap == null)
      {
        ab.i("MicroMsg.DeviceInfoParser", "hy: null device config");
        bool = false;
        AppMethodBeat.o(92991);
        return bool;
      }
      if (localMap.get(".deviceinfoconfig.voip.cpu.armv7") != null)
      {
        paramo.esP = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.cpu.armv7"), 0);
        paramo.esO = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.cpu.armv6") != null)
      {
        paramo.esQ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.cpu.armv6"), 0);
        paramo.esO = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.num") != null)
      {
        paramc.eqQ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.num"), 0);
        paramc.eqR = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.surface") != null)
      {
        paramc.eqS = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.surface"), 0);
        paramc.eqT = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.format") != null)
      {
        paramc.eqW = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.format"), 0);
        paramc.aTf = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.autofloat") != null)
        paramc.eqU = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.autofloat"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.manufloat") != null)
        paramc.eqV = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.manufloat"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.back.enable") != null)
      {
        paramc.eqZ.erD = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.back.enable"), 0);
        paramc.era = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.back.fps") != null)
      {
        paramc.eqZ.fps = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.back.fps"), 0);
        paramc.era = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.back.orien") != null)
      {
        paramc.eqZ.erE = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.back.orien"), 0);
        paramc.era = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.back.rotate") != null)
      {
        paramc.eqZ.rotate = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.back.rotate"), 0);
        paramc.era = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.back.isleft") != null)
      {
        paramc.eqZ.erF = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.back.isleft"), 0);
        paramc.era = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.back.width") != null)
      {
        paramc.eqZ.width = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.back.width"), 0);
        paramc.era = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.back.height") != null)
      {
        paramc.eqZ.height = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.back.height"), 0);
        paramc.era = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.front.enable") != null)
      {
        paramc.eqX.erD = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.front.enable"), 0);
        paramc.eqY = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.front.fps") != null)
      {
        paramc.eqX.fps = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.front.fps"), 0);
        paramc.eqY = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.front.orien") != null)
      {
        paramc.eqX.erE = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.front.orien"), 0);
        paramc.eqY = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.front.rotate") != null)
      {
        paramc.eqX.rotate = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.front.rotate"), 0);
        paramc.eqY = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.front.isleft") != null)
      {
        paramc.eqX.erF = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.front.isleft"), 0);
        paramc.eqY = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.front.width") != null)
      {
        paramc.eqX.width = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.front.width"), 0);
        paramc.eqY = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.front.height") != null)
      {
        paramc.eqX.height = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.front.height"), 0);
        paramc.eqY = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.videorecord.frotate") != null)
      {
        paramc.erc = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.videorecord.frotate"), 0);
        paramc.erb = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.videorecord.forientation") != null)
      {
        paramc.erd = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.videorecord.forientation"), 0);
        paramc.erb = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.videorecord.brotate") != null)
      {
        paramc.ere = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.videorecord.brotate"), 0);
        paramc.erb = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.videorecord.borientation") != null)
      {
        paramc.erf = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.videorecord.borientation"), 0);
        paramc.erb = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.videorecord.num") != null)
      {
        paramc.erg = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.videorecord.num"), 0);
        paramc.erh = true;
        paramc.erb = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.videorecord.api20") != null)
        paramc.erj = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.videorecord.api20"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.setframerate") != null)
        paramc.eri = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.setframerate"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.scannerFocusThreshold") != null)
        paramc.erk = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.scannerFocusThreshold"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.scannerImageQuality") != null)
        paramc.erl = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.scannerImageQuality"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.autoFocusTimeInterval") != null)
        paramc.erx = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.autoFocusTimeInterval"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.focusType") != null)
        paramc.ery = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.focusType"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.videorecord.num") != null)
      {
        paramc.erg = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.videorecord.num"), 0);
        paramc.erh = true;
        paramc.erb = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.camera.videorecord.api20") != null)
        paramc.erj = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.videorecord.api20"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.setframerate") != null)
        paramc.eri = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.setframerate"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.useFixFPSMode") != null)
        paramc.erm = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.useFixFPSMode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.useRangeFPSMode") != null)
        paramc.ern = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.useRangeFPSMode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.setYUV420SPFormat") != null)
        paramc.ero = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.setYUV420SPFormat"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.useMeteringMode") != null)
        paramc.erp = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.useMeteringMode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.useContinueVideoFocusMode") != null)
        paramc.erq = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.useContinueVideoFocusMode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.mUsestabilizationsupported") != null)
        paramc.err = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.mUsestabilizationsupported"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.sightCameraID") != null)
        paramc.ert = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.sightCameraID"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.needEnhance") != null)
        paramc.eru = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.needEnhance"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.support480enc") != null)
        paramc.erv = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.support480enc"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.supportHWenc") != null)
        paramc.erw = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.supportHWenc"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.voipBeauty") != null)
        paramc.erz = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.voipBeauty"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.fpsMin") != null)
        paramc.erA = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.fpsMin"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.fpsMax") != null)
        paramc.erB = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.camera.fpsMax"), 0);
      if (localMap.get(".deviceinfoconfig.voip.camera.autoRotate") != null)
        paramc.erC = bo.getBoolean((String)localMap.get(".deviceinfoconfig.voip.camera.autoRotate"), false);
      if (localMap.get(".deviceinfoconfig.voip.audio.streamtype") != null)
      {
        paramb.epH = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.streamtype"), 0);
        paramb.epG = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.smode") != null)
      {
        paramb.epI = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.smode"), 0);
        paramb.epG = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.omode") != null)
      {
        paramb.epJ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.omode"), 0);
        paramb.epG = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.ospeaker") != null)
      {
        paramb.epK = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.ospeaker"), 0);
        paramb.epG = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.operating") != null)
      {
        paramb.epL = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.operating"), 0);
        paramb.epG = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.moperating") != null)
      {
        paramb.epM = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.moperating"), 0);
        paramb.epG = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.mstreamtype") != null)
      {
        paramb.epN = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.mstreamtype"), 0);
        paramb.epG = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.recordmode") != null)
        paramb.epO = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.recordmode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.playenddelay") != null)
        paramb.epP = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.playenddelay"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.aecmode") != null)
        paramb.epQ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.aecmode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.nsmode") != null)
        paramb.epR = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.nsmode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.volummode") != null)
        paramb.epS = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.volummode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.sourcemode") != null)
        paramb.eqf = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.sourcemode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.micmode") != null)
        paramb.eqe = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.micmode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.speakerMode") != null)
        paramb.eqg = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.speakerMode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.phoneMode") != null)
        paramb.eqh = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.phoneMode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.deviceinfo.voipstreamType") != null)
        paramb.eqi = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.deviceinfo.voipstreamType"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.speakerstreamtype") != null)
        paramb.eqj = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.speakerstreamtype"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.phonestreamtype") != null)
        paramb.eqk = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.phonestreamtype"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.ringphonestream") != null)
        paramb.eqm = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.ringphonestream"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.ringphonemode") != null)
        paramb.eqn = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.ringphonemode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.ringspeakerstream") != null)
        paramb.eqo = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.ringspeakerstream"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.ringspeakermode") != null)
        paramb.eqp = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.ringspeakermode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.aecmodenew") != null)
        paramb.eqq = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.aecmodenew"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.nsmodenew") != null)
        paramb.eqr = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.nsmodenew"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agcmodenew") != null)
        paramb.eqs = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agcmodenew"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agcmode") != null)
        paramb.eqt = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agcmode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agctargetdb") != null)
        paramb.equ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agctargetdb"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agcgaindb") != null)
        paramb.eqv = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agcgaindb"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agcflag") != null)
        paramb.eqw = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agcflag"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agclimiter") != null)
        paramb.eqx = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agclimiter"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.inputvolumescale") != null)
        paramb.epT = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.inputvolumescale"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.outputvolumescale") != null)
        paramb.epU = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.outputvolumescale"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.inputvolumescaleforspeaker") != null)
        paramb.epV = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.inputvolumescaleforspeaker"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.outputvolumescaleforspeaker") != null)
        paramb.epW = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.outputvolumescaleforspeaker"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.ehanceheadsetec") != null)
        paramb.epZ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.ehanceheadsetec"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.setecmodelevelforheadset") != null)
        paramb.eqa = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.setecmodelevelforheadset"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.setecmodelevelforspeaker") != null)
        paramb.eqb = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.setecmodelevelforspeaker"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.enablespeakerenhanceec") != null)
        paramb.eqc = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.enablespeakerenhanceec"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.enablerectimer") != null)
        paramb.eqy = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.enablerectimer"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.enablePlayTimer") != null)
        paramb.eqz = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.enablePlayTimer"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof0") != null)
      {
        paramb.eqB[0] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof0"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof1") != null)
      {
        paramb.eqB[1] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof1"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof2") != null)
      {
        paramb.eqB[2] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof2"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof3") != null)
      {
        paramb.eqB[3] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof3"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof4") != null)
      {
        paramb.eqB[4] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof4"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof5") != null)
      {
        paramb.eqB[5] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof5"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof6") != null)
      {
        paramb.eqB[6] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof6"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof7") != null)
      {
        paramb.eqB[7] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof7"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof8") != null)
      {
        paramb.eqB[8] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof8"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof9") != null)
      {
        paramb.eqB[9] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof9"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof10") != null)
      {
        paramb.eqB[10] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof10"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof11") != null)
      {
        paramb.eqB[11] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof11"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof12") != null)
      {
        paramb.eqB[12] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof12"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof13") != null)
      {
        paramb.eqB[13] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof13"), 0));
        paramb.eqA = 1;
      }
      if (localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof14") != null)
      {
        paramb.eqB[14] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctcof.cof14"), 0));
        paramb.eqA = 1;
      }
      if ((localMap.get(".deviceinfoconfig.voip.audio.correctoff") != null) && (bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.correctoff"), 0) == 1))
        paramb.eqA = 0;
      if (localMap.get(".deviceinfoconfig.voip.audio.outputvolumegainforphone") != null)
        paramb.epX = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.outputvolumegainforphone"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.outputvolumegainforspeaker") != null)
        paramb.epY = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.outputvolumegainforspeaker"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof0") != null)
        paramb.eqC[0] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof0"), 0));
      if (localMap.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof1") != null)
        paramb.eqC[1] = ((short)(short)bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof1"), 0));
      if (localMap.get(".deviceinfoconfig.voip.audio.agcrxflag") != null)
        paramb.eqM = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agcrxflag"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agcrxtargetdb") != null)
        paramb.eqN = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agcrxtargetdb"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agcrxgaindb") != null)
        paramb.eqO = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agcrxgaindb"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.agcrxlimiter") != null)
        paramb.eqP = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.agcrxlimiter"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.spkecenable") != null)
        paramb.eqE = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.spkecenable"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.enableXnoiseSup") != null)
        paramb.eqd = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.enableXnoiseSup"), 0);
      if (localMap.get(".deviceinfoconfig.voip.audio.playenddelay") != null)
        paramb.epP = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.audio.playenddelay"), 0);
      if (localMap.get(".deviceinfoconfig.voip.ipcall.speakermode") != null)
      {
        paramb.eqG = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.ipcall.speakermode"), 0);
        paramb.eqF = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.ipcall.phonemode") != null)
      {
        paramb.eqH = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.ipcall.phonemode"), 0);
        paramb.eqF = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.ipcall.sourcemode") != null)
      {
        paramb.eqI = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.ipcall.sourcemode"), 0);
        paramb.eqF = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.ipcall.streamtype") != null)
      {
        paramb.eqJ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.ipcall.streamtype"), 0);
        paramb.eqF = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.ipcall.speakerstreamtype") != null)
      {
        paramb.eqK = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.ipcall.speakerstreamtype"), 0);
        paramb.eqF = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.ipcall.phonestreamtype") != null)
      {
        paramb.eqL = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.ipcall.phonestreamtype"), 0);
        paramb.eqF = true;
      }
      if (localMap.get(".deviceinfoconfig.voip.common.js") != null)
      {
        paramk.erQ = true;
        paramk.erR = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.js"), 0);
      }
      if (localMap.get(".deviceinfoconfig.voip.common.js") != null)
        paramk.erI = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.js"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.stopbluetoothbr") != null)
        paramk.erJ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.stopbluetoothbr"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.stopbluetoothbu") != null)
        paramk.erK = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.stopbluetoothbu"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.setbluetoothscoon") != null)
        paramk.erM = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.setbluetoothscoon"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.startbluetoothsco") != null)
        paramk.erL = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.startbluetoothsco"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.voicesearchfastmode") != null)
        paramk.erN = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.voicesearchfastmode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.pcmreadmode") != null)
        paramk.erP = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.pcmreadmode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.pcmbufferrate") != null)
        paramk.erO = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.pcmbufferrate"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.app") != null)
        paramk.erS = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.app"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.deviceinfo.voipapp") != null)
        paramk.esl = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.deviceinfo.voipapp"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.deviceinfo.voipappns") != null)
        paramk.esm = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.deviceinfo.voipappns"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.deviceinfo.voipappaec") != null)
        paramk.esn = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.deviceinfo.voipappaec"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.deviceinfo.voipappagc") != null)
        paramk.eso = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.deviceinfo.voipappagc"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.vmfd") != null)
        paramk.erT = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.vmfd"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.htcvoicemode") != null)
        paramk.erU = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.htcvoicemode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.samsungvoicemode") != null)
        paramk.erV = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.samsungvoicemode"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.speexbufferrate") != null)
        paramk.erW = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.speexbufferrate"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.linespe") != null)
        paramk.erX = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.linespe"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.fixspan") != null)
        paramk.esi = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.fixspan"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.extvideo") != null)
        paramk.erY = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.extvideo"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.extvideosam") != null)
        paramk.erZ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.extvideosam"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.sysvideodegree") != null)
        paramk.esa = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.sysvideodegree"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.mmnotify") != null)
        paramk.esd = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.mmnotify"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.extsharevcard") != null)
        paramk.esc = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.extsharevcard"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.audioformat") != null)
        paramk.ese = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.audioformat"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.qrcam") != null)
        paramk.esf = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.qrcam"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.sysvideofdegree") != null)
        paramk.esb = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.sysvideofdegree"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.audioformat") != null)
        paramk.ese = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.audioformat"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.qrcam") != null)
        paramk.esf = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.qrcam"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.base") != null)
        paramk.esp = ((String)localMap.get(".deviceinfoconfig.voip.common.base"));
      if (localMap.get(".deviceinfoconfig.voip.common.packageinfo") != null)
        paramk.esq = ((String)localMap.get(".deviceinfoconfig.voip.common.packageinfo"));
      if (localMap.get(".deviceinfoconfig.voip.common.classloader") != null)
        paramk.esr = ((String)localMap.get(".deviceinfoconfig.voip.common.classloader"));
      if (localMap.get(".deviceinfoconfig.voip.common.resources") != null)
        paramk.ess = ((String)localMap.get(".deviceinfoconfig.voip.common.resources"));
      if (localMap.get(".deviceinfoconfig.voip.common.sysvideofp") != null)
        paramk.esg = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.sysvideofp"), 0);
      if (localMap.get(".deviceinfoconfig.voip.common.extstoragedir") != null)
        paramk.est = ((String)localMap.get(".deviceinfoconfig.voip.common.extstoragedir"));
      if (localMap.get(".deviceinfoconfig.voip.common.extpubdir") != null)
        paramk.esu = ((String)localMap.get(".deviceinfoconfig.voip.common.extpubdir"));
      if (localMap.get(".deviceinfoconfig.voip.common.extdatadir") != null)
        paramk.esv = ((String)localMap.get(".deviceinfoconfig.voip.common.extdatadir"));
      if (localMap.get(".deviceinfoconfig.voip.common.extrootdir") != null)
        paramk.esw = ((String)localMap.get(".deviceinfoconfig.voip.common.extrootdir"));
      if (localMap.get(".deviceinfoconfig.voip.common.extstoragestate") != null)
        paramk.esx = ((String)localMap.get(".deviceinfoconfig.voip.common.extstoragestate"));
      if (localMap.get(".deviceinfoconfig.voip.common.extcachedir") != null)
        paramk.esy = ((String)localMap.get(".deviceinfoconfig.voip.common.extcachedir"));
      if (localMap.get(".deviceinfoconfig.voip.common.extvideoplayer") != null)
        paramk.esh = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.extvideoplayer"), -1);
      if (localMap.get(".deviceinfoconfig.voip.common.loadDrawable") != null)
        paramk.esz = ((String)localMap.get(".deviceinfoconfig.voip.common.loadDrawable"));
      if (localMap.get(".deviceinfoconfig.voip.common.loadXmlResourceParser") != null)
        paramk.esA = ((String)localMap.get(".deviceinfoconfig.voip.common.loadXmlResourceParser"));
      if ((localMap.get(".deviceinfoconfig.voip.common.sensorNearFar") != null) && (1 == bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.sensorNearFar"), 0)))
        com.tencent.mm.sdk.platformtools.SensorController.xBI = true;
      if (localMap.get(".deviceinfoconfig.voip.common.sensorNearFarDivideRatio") != null)
        com.tencent.mm.sdk.platformtools.SensorController.xBJ = bo.getDouble((String)localMap.get(".deviceinfoconfig.voip.common.sensorNearFarDivideRatio"), 0.0D);
      if (localMap.get(".deviceinfoconfig.voip.common.sightFullType") != null)
        paramk.esB = ((String)localMap.get(".deviceinfoconfig.voip.common.sightFullType"));
      if (localMap.get(".deviceinfoconfig.voip.common.slyTextureView") != null)
        paramk.esC = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.slyTextureView"), -1);
      if (localMap.get(".deviceinfoconfig.voip.common.checkSightDraftMd5") != null)
        paramk.esD = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.checkSightDraftMd5"), 1);
      label6274: label6922: label6966: int i;
      label6528: int j;
      int k;
      if (localMap.get(".deviceinfoconfig.voip.common.swipeBackConfig") != null)
      {
        paramk.esE = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.swipeBackConfig"), 1);
        if (paramk.esE == 1)
        {
          bool = true;
          com.tencent.mm.compatible.i.b.bK(bool);
        }
      }
      else
      {
        if (localMap.get(".deviceinfoconfig.voip.common.canDecodeWebp") != null)
          paramk.esF = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.canDecodeWebp"), 1);
        if (localMap.get(".deviceinfoconfig.voip.common.isScanZoom") != null)
          paramk.esj = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.isScanZoom"), -1);
        if (localMap.get(".deviceinfoconfig.voip.common.scanMaxZoomDivideRatio") != null)
          paramk.esk = bo.getDouble((String)localMap.get(".deviceinfoconfig.voip.common.scanMaxZoomDivideRatio"), -1.0D);
        if (localMap.get(".deviceinfoconfig.voip.common.notificationSetMode") != null)
          paramk.esG = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.notificationSetMode"), -1);
        if (localMap.get(".deviceinfoconfig.voip.common.hevcTransCodeMediaCodec") != null)
          paramk.esH = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.hevcTransCodeMediaCodec"), -1);
        if (localMap.get(".deviceinfoconfig.voip.common.videoSupportHevcDecode") != null)
          paramk.esI = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.common.videoSupportHevcDecode"), -1);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.useThisInfo") != null)
        {
          if (bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.useThisInfo"), 0) != 1)
            break label8050;
          bool = true;
          paramx.etU = bool;
        }
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.width") != null)
          paramx.mVideoWidth = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.width"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.height") != null)
          paramx.mVideoHeight = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.height"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.frameRate") != null)
          paramx.etV = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.frameRate"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.encodingBitRate") != null)
          paramx.etW = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.encodingBitRate"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.useSystem") != null)
          paramx.etX = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.useSystem"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.yuv420SPSeek") != null)
          paramx.etY = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.yuv420SPSeek"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.useMediaCodecEncodeAAC") != null)
          paramx.etZ = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.useMediaCodecEncodeAAC"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.AACSampleRate") != null)
          paramx.eua = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.AACSampleRate"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.useTextureViewForCamera") != null)
          paramx.eub = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.useTextureViewForCamera"), 0);
        if (localMap.get(".deviceinfoconfig.voip.mediaRecorder.useFDWithFileSize") != null)
          paramx.euc = bo.getInt((String)localMap.get(".deviceinfoconfig.voip.mediaRecorder.useFDWithFileSize"), 0);
        if (localMap.get(".deviceinfoconfig.voip.webview.notifythread") != null)
        {
          if (bo.getInt((String)localMap.get(".deviceinfoconfig.voip.webview.notifythread"), 0) != 1)
            break label8056;
          bool = true;
          paramac.eui = bool;
        }
        if (localMap.get(".deviceinfoconfig.voip.webview.forceUseSysWebView") != null)
        {
          if (bo.getInt((String)localMap.get(".deviceinfoconfig.voip.webview.forceUseSysWebView"), 0) != 1)
            break label8062;
          bool = true;
          paramac.euj = bool;
          ab.i("MicroMsg.DeviceInfoParser", "save forceusesystemwebview = %b", new Object[] { Boolean.valueOf(paramac.euj) });
          ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit().putBoolean("tbs_force_user_sys_webview", paramac.euj).commit();
        }
        paramk.dump();
        i = bo.getInt((String)localMap.get(".deviceinfoconfig.fingerprint.forceFingerprintStatus"), 0);
        j = bo.getInt((String)localMap.get(".deviceinfoconfig.fingerprint.supportExportEntrance"), 0);
        ab.i("MicroMsg.DeviceInfoParser", "hy: got fingerprint force status: %d", new Object[] { Integer.valueOf(i) });
        if (params != null)
        {
          params.iS(i);
          params.iR(j);
        }
        k = bo.getInt((String)localMap.get(".deviceinfoconfig.soter.isSupport"), 0);
        ab.i("MicroMsg.DeviceInfoParser", "hy: get soter status: %d", new Object[] { Integer.valueOf(k) });
        if (paramaa != null)
        {
          if (k <= 0)
            break label8068;
          bool = true;
          label7164: paramaa.bJ(bool);
          paramaa.iU(k);
        }
        if ((i == 11) && (j == 11) && (paramaa != null))
        {
          params.iS(1);
          params.iR(1);
          paramaa.bJ(true);
          paramaa.iU(1);
          paramaa.Mf();
          ab.i("MicroMsg.DeviceInfoParser", "py: hw patch is available now!");
        }
        paramo = (String)localMap.get(".deviceinfoconfig.freeWifi.operations.bizUserName");
        ab.i("MicroMsg.DeviceInfoParser", "lm: got PublicNum: %s", new Object[] { paramo });
        if (paramw != null)
          paramw.kv(paramo);
        paramString = br.z(paramString, "manufacturerName");
        ab.i("MicroMsg.DeviceInfoParser", "lm: got manufacturerNameMaps: %s", new Object[] { paramString });
        if (paramw != null)
          paramw.f(paramString);
        k = bo.getInt((String)localMap.get(".deviceinfoconfig.style.swipback"), 0);
        ab.i("MicroMsg.DeviceInfoParser", "lm: got swipback: %d", new Object[] { Integer.valueOf(k) });
        if (paramw != null)
          paramw.iT(k);
        k = bo.getInt((String)localMap.get(".deviceinfoconfig.game.isLimit"), 0);
        paramString = (String)localMap.get(".deviceinfoconfig.game.limitPrompt");
        ab.i("MicroMsg.DeviceInfoParser", "lm: get game status: %d,gamePrompt:%s", new Object[] { Integer.valueOf(k), paramString });
        if (parama != null)
          if (k != 1)
            break label8074;
      }
      label8068: label8074: for (bool = true; ; bool = false)
      {
        parama.bG(bool);
        parama.kr(paramString);
        int m = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.recordertype"), -1);
        int n = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.needRotateEachFrame"), -1);
        int i1 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.enableHighResolutionRecord"), -1);
        int i2 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.landscapeRecordModeEnable"), -1);
        int i3 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.transcodeDecoderType"), -1);
        int i4 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.mediaPlayerType"), -1);
        int i5 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.strategyMask"), -1);
        int i6 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.recorderOption"), -1);
        int i7 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.useMetering"), -1);
        k = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.transcodeEncoderType"), -1);
        int i8 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.checkSendVideoBitrate"), -1);
        int i9 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.cpuCrop"), -1);
        int i10 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.storyRecorderType"), -1);
        j = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.backgroundRemux"), -1);
        i = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.emojiPreviewSize"), -1);
        int i11 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.emojiStickerSampleSize"), -1);
        int i12 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.emojiUseSmallModel"), -1);
        int i13 = bo.getInt((String)localMap.get(".deviceinfoconfig.mmsight.emojiUseGpuSegment"), -1);
        if (paramv1 != null)
        {
          paramv1.etz = m;
          paramv1.etA = n;
          paramv1.etB = i1;
          paramv1.etC = i2;
          paramv1.etD = i3;
          paramv1.etE = i4;
          paramv1.etF = i5;
          paramv1.etG = i6;
          paramv1.etH = i7;
          paramv1.etI = k;
          paramv1.etJ = i8;
          paramv1.etM = i;
          paramv1.etN = i11;
          paramv1.etO = i12;
          paramv1.etP = i13;
          ab.i("MicroMsg.DeviceInfoParser", "get mmSightRecorderInfo: %s", new Object[] { paramv1.toString() });
        }
        if (paramv2 != null)
        {
          paramv2.etz = i10;
          paramv2.etA = n;
          paramv2.etB = i1;
          paramv2.etC = i2;
          paramv2.etD = i3;
          paramv2.etE = i4;
          paramv2.etF = i5;
          paramv2.etG = i6;
          paramv2.etH = i7;
          paramv2.etI = k;
          paramv2.etJ = i8;
          paramv2.etK = i9;
          paramv2.etL = j;
          ab.i("MicroMsg.DeviceInfoParser", "get mmStoryRecorderInfo: %s", new Object[] { paramv2.toString() });
        }
        bool = true;
        AppMethodBeat.o(92991);
        break;
        bool = false;
        break label6274;
        label8050: bool = false;
        break label6528;
        label8056: bool = false;
        break label6922;
        label8062: bool = false;
        break label6966;
        bool = false;
        break label7164;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DeviceInfoParser", paramString, "", new Object[0]);
        boolean bool = false;
        AppMethodBeat.o(92991);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.r
 * JD-Core Version:    0.6.2
 */