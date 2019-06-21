package com.tencent.mm.plugin.music.model.d;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.cache.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class e
  implements com.tencent.mm.plugin.music.e.d
{
  private f oNn;
  private c oNo;
  private a oNp;

  public e()
  {
    AppMethodBeat.i(105021);
    this.oNn = new f();
    this.oNo = new c();
    this.oNp = new a();
    AppMethodBeat.o(105021);
  }

  public final void a(com.tencent.mm.aw.e parame, String paramString)
  {
    AppMethodBeat.i(105027);
    Object localObject = this.oNo;
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
    {
      str = paramString;
      if (((c)localObject).oNh != null)
        str = ((c)localObject).getMimeType();
    }
    ab.i("MicroMsg.Music.MusicPlayerReportImpl", "idKeyReportMusicMimeType mineType:%s, hasStatForMimeType:%b", new Object[] { str, Boolean.valueOf(((c)localObject).oNf) });
    int i;
    if ((!TextUtils.isEmpty(str)) && (!((c)localObject).oNf))
    {
      ab.i("MicroMsg.Music.MusicPlayerReportImpl", "idKeyReportMusicMimeType OK");
      ((c)localObject).oNf = true;
      localObject = new IDKey();
      ((IDKey)localObject).SetID(558);
      if (!"audio/3gpp".equalsIgnoreCase(str))
        break label211;
      i = 70;
    }
    while (true)
    {
      ((IDKey)localObject).SetKey(i);
      ((IDKey)localObject).SetValue(1L);
      paramString = new ArrayList();
      paramString.add(localObject);
      h.pYm.b(paramString, true);
      if (parame != null)
      {
        i = b.To(str);
        h.pYm.e(14486, new Object[] { Integer.valueOf(0), Integer.valueOf(parame.fJS), Integer.valueOf(i), str });
      }
      AppMethodBeat.o(105027);
      return;
      label211: if ("audio/amr-wb".equalsIgnoreCase(str))
        i = 71;
      else if (("audio/mpeg".equalsIgnoreCase(str)) || (str.equalsIgnoreCase("audio/mp3")))
        i = 72;
      else if (("audio/mp4a-latm".equalsIgnoreCase(str)) || (str.startsWith("audio/mp4")))
        i = 73;
      else if ("audio/qcelp".equalsIgnoreCase(str))
        i = 74;
      else if ("audio/vorbis".equalsIgnoreCase(str))
        i = 75;
      else if ("audio/opus".equalsIgnoreCase(str))
        i = 76;
      else if ("audio/g711-alaw".equalsIgnoreCase(str))
        i = 77;
      else if ("audio/g711-mlaw".equalsIgnoreCase(str))
        i = 78;
      else if ("audio/raw".equalsIgnoreCase(str))
        i = 79;
      else if ("audio/flac".equalsIgnoreCase(str))
        i = 80;
      else if ("audio/gsm".equalsIgnoreCase(str))
        i = 81;
      else if ("audio/ac3".equalsIgnoreCase(str))
        i = 82;
      else if ("audio/eac3".equalsIgnoreCase(str))
        i = 83;
      else if ("audio/x-ms-wma".equalsIgnoreCase(str))
        i = 84;
      else if ("audio/x-wav".equalsIgnoreCase(str))
        i = 85;
      else if (("audio/x-ape".equalsIgnoreCase(str)) || ("application/x-ape".equalsIgnoreCase(str)))
        i = 86;
      else
        i = 87;
    }
  }

  public final void a(com.tencent.mm.plugin.music.c.b paramb)
  {
    this.oNo.oNh = paramb;
  }

  public final void b(com.tencent.mm.aw.e parame, int paramInt)
  {
    AppMethodBeat.i(105023);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(558);
    localIDKey1.SetKey(4);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(558);
    int i = parame.fJS;
    ab.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
    IDKey localIDKey3;
    IDKey localIDKey4;
    ArrayList localArrayList;
    int j;
    int k;
    label317: int m;
    IDKey localIDKey5;
    switch (i)
    {
    case 2:
    case 3:
    default:
      i = 9;
      localIDKey2.SetKey(i);
      localIDKey2.SetValue(1L);
      localIDKey3 = new IDKey();
      localIDKey3.SetID(558);
      localIDKey3.SetKey(b.zM(paramInt));
      localIDKey3.SetValue(1L);
      localIDKey4 = new IDKey();
      localIDKey4.SetID(558);
      localIDKey4.SetValue(1L);
      localArrayList = new ArrayList();
      j = 0;
      k = 0;
      if (paramInt == 80)
      {
        i = parame.fJS;
        ab.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerNetworkErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
        switch (i)
        {
        case 2:
        case 3:
        case 5:
        default:
          i = 188;
          localIDKey4.SetKey(i);
          localArrayList.add(localIDKey4);
          j = 1;
          i = g.Tb(parame.playUrl);
          m = g.Tc(parame.playUrl);
          if (g.Tb(parame.playUrl) == 403)
          {
            localIDKey5 = new IDKey();
            localIDKey5.SetID(558);
            localIDKey5.SetValue(1L);
            localIDKey5.SetKey(b.zM(700));
            localArrayList.add(localIDKey5);
          }
          break;
        case 0:
        case 1:
        case 4:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        }
      }
      break;
    case 0:
    case 1:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    }
    while (true)
    {
      h.pYm.e(14777, new Object[] { Integer.valueOf(1), Integer.valueOf(parame.fJS), Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(m) });
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      localArrayList.add(localIDKey3);
      h.pYm.b(localArrayList, true);
      AppMethodBeat.o(105023);
      return;
      i = 49;
      break;
      i = 50;
      break;
      i = 51;
      break;
      i = 52;
      break;
      i = 53;
      break;
      i = 54;
      break;
      i = 55;
      break;
      i = 56;
      break;
      i = 7;
      break;
      i = 8;
      break;
      i = 167;
      break label317;
      i = 168;
      break label317;
      i = 169;
      break label317;
      i = 170;
      break label317;
      i = 171;
      break label317;
      i = 172;
      break label317;
      i = 173;
      break label317;
      i = 174;
      break label317;
      i = 175;
      break label317;
      if ((g.SY(parame.playUrl) != null) && (g.SY(parame.playUrl).contains("text/html")))
      {
        i = 701;
        localIDKey5 = new IDKey();
        localIDKey5.SetID(558);
        localIDKey5.SetValue(1L);
        localIDKey5.SetKey(b.zM(701));
        localArrayList.add(localIDKey5);
        m = 0;
      }
      else
      {
        if (paramInt != 70)
          switch (paramInt)
          {
          default:
            i = 0;
            label787: if (i != 0)
            {
              localIDKey5 = new IDKey();
              localIDKey5.SetID(558);
              localIDKey5.SetValue(1L);
              i = parame.fJS;
              ab.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerDecodeErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
            }
            switch (i)
            {
            case 2:
            case 3:
            case 5:
            default:
              i = 188;
              label905: localIDKey5.SetKey(i);
              localArrayList.add(localIDKey5);
              i = parame.fJS;
              ab.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerPlayErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
              switch (i)
              {
              case 2:
              case 3:
              case 5:
              default:
                i = 188;
              case 0:
              case 1:
              case 4:
              case 6:
              case 7:
              case 8:
              case 9:
              case 10:
              case 11:
              }
              break;
            case 0:
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            }
            break;
          case 62:
          case 63:
          case 64:
          case 67:
          case 74:
          }
        while (true)
        {
          localIDKey4.SetKey(i);
          localArrayList.add(localIDKey4);
          m = 0;
          i = k;
          break;
          i = 1;
          break label787;
          i = 202;
          break label905;
          i = 203;
          break label905;
          i = 204;
          break label905;
          i = 205;
          break label905;
          i = 206;
          break label905;
          i = 207;
          break label905;
          i = 208;
          break label905;
          i = 209;
          break label905;
          i = 210;
          break label905;
          i = 178;
          continue;
          i = 179;
          continue;
          i = 180;
          continue;
          i = 181;
          continue;
          i = 182;
          continue;
          i = 183;
          continue;
          i = 184;
          continue;
          i = 185;
          continue;
          i = 186;
        }
      }
    }
  }

  public final void bTT()
  {
    AppMethodBeat.i(105025);
    c localc = this.oNo;
    ab.i("MicroMsg.Music.MusicPlayerReportImpl", "initIdKeyStatDataForMusicPlayer");
    localc.oMX = false;
    localc.oMY = false;
    localc.oMZ = false;
    localc.oNa = false;
    localc.oNb = false;
    localc.oNc = false;
    localc.oNd = false;
    localc.oNe = false;
    localc.oNf = false;
    localc.oNg = 0;
    AppMethodBeat.o(105025);
  }

  public final void c(com.tencent.mm.aw.e parame, int paramInt)
  {
    AppMethodBeat.i(105024);
    Object localObject = new IDKey();
    ((IDKey)localObject).SetID(558);
    if (paramInt == 2)
    {
      paramInt = 92;
      ((IDKey)localObject).SetKey(paramInt);
      ((IDKey)localObject).SetValue(1L);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localObject);
      h.pYm.b(localArrayList, true);
      localObject = g.SY(parame.playUrl);
      ab.i("MicroMsg.Music.QQMusicPlayerReportImpl", "mineTypeStr:%s", new Object[] { localObject });
      if ((parame == null) || (TextUtils.isEmpty((CharSequence)localObject)))
        break label240;
      paramInt = b.To((String)localObject);
      h.pYm.e(14486, new Object[] { Integer.valueOf(1), Integer.valueOf(parame.fJS), Integer.valueOf(paramInt), localObject });
      AppMethodBeat.o(105024);
    }
    while (true)
    {
      return;
      if (paramInt == 3)
      {
        paramInt = 93;
        break;
      }
      if (paramInt == 4)
      {
        paramInt = 94;
        break;
      }
      if (paramInt == 5)
      {
        paramInt = 95;
        break;
      }
      if (paramInt == 6)
      {
        paramInt = 96;
        break;
      }
      if (paramInt == 7)
      {
        paramInt = 97;
        break;
      }
      if (paramInt == 8)
      {
        paramInt = 98;
        break;
      }
      if (paramInt == 9)
      {
        paramInt = 99;
        break;
      }
      paramInt = 100;
      break;
      label240: ab.e("MicroMsg.Music.QQMusicPlayerReportImpl", "music is null or mineTypeStr is empty");
      AppMethodBeat.o(105024);
    }
  }

  public final void c(com.tencent.mm.aw.e parame, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105026);
    c localc = this.oNo;
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(558);
    localIDKey1.SetKey(3);
    localIDKey1.SetValue(1L);
    Object localObject = new IDKey();
    ((IDKey)localObject).SetID(558);
    int i = parame.fJS;
    ab.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
    label182: ArrayList localArrayList;
    IDKey localIDKey3;
    switch (i)
    {
    case 2:
    case 3:
    default:
      i = 6;
      ((IDKey)localObject).SetKey(i);
      ((IDKey)localObject).SetValue(1L);
      localIDKey2 = new IDKey();
      localIDKey2.SetID(558);
      if (paramInt1 == -1)
      {
        localIDKey2.SetKey(12);
        localIDKey2.SetValue(1L);
        localArrayList = new ArrayList();
        localIDKey3 = new IDKey();
        localIDKey3.SetID(558);
        localIDKey3.SetValue(1L);
        if ((paramInt1 != 19) && ((localc.getMimeType() == null) || (!localc.getMimeType().contains("text/html"))))
        {
          if (paramInt1 != 21)
            break label1508;
          i = parame.fJS;
          ab.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerPlayErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
        }
        switch (i)
        {
        case 2:
        case 3:
        case 5:
        default:
          i = 188;
          label337: localIDKey3.SetKey(i);
          localArrayList.add(localIDKey3);
          label352: localArrayList.add(localIDKey1);
          localArrayList.add(localObject);
          localArrayList.add(localIDKey2);
          ab.i("MicroMsg.Music.MusicPlayerReportImpl", "hasStatForHttpErr:%b, hasStatForUrlErr:%b, hasStatForNetworkErr:%b, hasStatForHttpRangeErr:%b, hasStatDownloadExceptionErr:%b", new Object[] { Boolean.valueOf(localc.oMX), Boolean.valueOf(localc.oMZ), Boolean.valueOf(localc.oNc), Boolean.valueOf(localc.oMY), Boolean.valueOf(localc.oNa) });
          if ((paramInt1 == -1) && (!localc.oMX))
          {
            localc.oMX = true;
            i = 0;
            if (localc.oNh != null)
              i = localc.oNh.oLx;
            if (i == 403)
            {
              localObject = new IDKey();
              ((IDKey)localObject).SetID(558);
              ((IDKey)localObject).SetValue(1L);
              ((IDKey)localObject).SetKey(b.zN(700));
              localArrayList.add(localObject);
            }
            h.pYm.b(localArrayList, true);
            h.pYm.e(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parame.fJS), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(0) });
          }
          if ((paramInt1 == 6) && (!localc.oMY))
          {
            localc.oMY = true;
            h.pYm.b(localArrayList, true);
            h.pYm.e(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parame.fJS), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(0) });
          }
          if ((paramInt1 == -2) && (!localc.oMZ))
          {
            localc.oMZ = true;
            h.pYm.b(localArrayList, true);
            h.pYm.e(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parame.fJS), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(0) });
          }
          if ((paramInt1 == 5) && (!localc.oNa))
          {
            localc.oNa = true;
            h.pYm.b(localArrayList, true);
            i = 0;
            if (localc.oNh != null)
              i = localc.oNh.clN;
            h.pYm.e(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parame.fJS), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(i) });
          }
          if ((paramInt1 == 19) && (!localc.oNb))
          {
            localc.oNb = true;
            h.pYm.b(localArrayList, true);
            h.pYm.e(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parame.fJS), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(0) });
          }
          if ((paramInt1 == 4) && (!localc.oNc))
          {
            localc.oNc = true;
            h.pYm.b(localArrayList, true);
            h.pYm.e(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parame.fJS), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(0) });
          }
          if ((paramInt1 == 20) && (!localc.oNd))
          {
            localc.oNd = true;
            localc.oNg = paramInt2;
            localObject = new ArrayList();
            ((ArrayList)localObject).add(localIDKey2);
            h.pYm.b((ArrayList)localObject, true);
          }
          if ((paramInt1 == 21) && (!localc.oNe) && (localc.oNd))
          {
            localc.oNe = true;
            if ((localc.getMimeType() == null) || (!localc.getMimeType().contains("text/html")))
              break label1691;
            i = 701;
            localIDKey2 = new IDKey();
            localIDKey2.SetID(558);
            localIDKey2.SetValue(1L);
            localIDKey2.SetKey(b.zN(701));
            localArrayList.add(localIDKey2);
          }
          break;
        case 0:
        case 1:
        case 4:
        case 6:
        case 7:
        case 8:
        case 9:
        }
      }
      break;
    case 0:
    case 1:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    label1508: int j;
    label1691: label1763: 
    do
    {
      h.pYm.b(localArrayList, true);
      h.pYm.e(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parame.fJS), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(0) });
      AppMethodBeat.o(105026);
      return;
      i = 60;
      break;
      i = 61;
      break;
      i = 62;
      break;
      i = 63;
      break;
      i = 64;
      break;
      i = 5;
      break;
      i = 65;
      break;
      i = 66;
      break;
      if (paramInt1 == 6)
      {
        localIDKey2.SetKey(46);
        break label182;
      }
      if (paramInt1 == -2)
      {
        localIDKey2.SetKey(13);
        break label182;
      }
      if (paramInt1 == 5)
      {
        localIDKey2.SetKey(16);
        break label182;
      }
      if (paramInt1 == 4)
      {
        localIDKey2.SetKey(14);
        break label182;
      }
      if (paramInt1 == 20)
      {
        localIDKey2.SetKey(11);
        break label182;
      }
      if (paramInt1 == 21)
      {
        localIDKey2.SetKey(47);
        break label182;
      }
      if (paramInt1 != 19)
        break label182;
      localIDKey2.SetKey(190);
      break label182;
      i = 159;
      break label337;
      i = 160;
      break label337;
      i = 161;
      break label337;
      i = 162;
      break label337;
      i = 163;
      break label337;
      i = 164;
      break label337;
      i = 165;
      break label337;
      if ((paramInt1 != -1) && (paramInt1 != 6) && (paramInt1 != -2) && (paramInt1 != 5) && (paramInt1 != 4))
        break label352;
      i = parame.fJS;
      ab.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerNetworkErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
      switch (i)
      {
      case 2:
      case 3:
      case 5:
      default:
        i = 188;
      case 0:
      case 1:
      case 4:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      while (true)
      {
        localIDKey3.SetKey(i);
        localArrayList.add(localIDKey3);
        break;
        i = 151;
        continue;
        i = 152;
        continue;
        i = 153;
        continue;
        i = 154;
        continue;
        i = 155;
        continue;
        i = 156;
        continue;
        i = 157;
      }
      localIDKey2 = new IDKey();
      localIDKey2.SetID(558);
      localIDKey2.SetValue(1L);
      localIDKey2.SetKey(b.zN(paramInt2));
      localArrayList.add(localIDKey2);
      switch (paramInt2)
      {
      default:
        j = 0;
        i = paramInt2;
      case 704:
      case 705:
      case 706:
      }
    }
    while (j == 0);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(558);
    localIDKey2.SetValue(1L);
    i = parame.fJS;
    ab.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerDecodeErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
    switch (i)
    {
    case 2:
    case 3:
    case 5:
    default:
      i = 188;
    case 0:
    case 1:
    case 4:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      localIDKey2.SetKey(i);
      localArrayList.add(localIDKey2);
      i = paramInt2;
      break;
      j = 1;
      break label1763;
      i = 194;
      continue;
      i = 195;
      continue;
      i = 196;
      continue;
      i = 197;
      continue;
      i = 198;
      continue;
      i = 199;
      continue;
      i = 200;
    }
  }

  public final void d(com.tencent.mm.aw.e parame, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105029);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(797);
    localIDKey1.SetKey(2);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(797);
    int i = parame.fJS;
    ab.i("MicroMsg.Music.ExoPlayIdkeyReport", "getExoMusicPlayerErrIdKeyByMusicType, musicType:".concat(String.valueOf(i)));
    IDKey localIDKey3;
    label259: IDKey localIDKey4;
    switch (i)
    {
    case 2:
    case 3:
    case 5:
    default:
      i = 71;
      localIDKey2.SetKey(i);
      localIDKey2.SetValue(1L);
      localIDKey3 = new IDKey();
      localIDKey3.SetID(797);
      ab.i("MicroMsg.Music.ExoPlayIdkeyReport", "getExoMusicPlayerErrTypeIdKey, errType:".concat(String.valueOf(paramInt1)));
      switch (paramInt1)
      {
      default:
        paramInt1 = 9;
        localIDKey3.SetKey(paramInt1);
        localIDKey3.SetValue(1L);
        localIDKey4 = new IDKey();
        localIDKey4.SetID(797);
        ab.i("MicroMsg.Music.ExoPlayIdkeyReport", "getExoMusicPlayerErrIdKey, errCode:".concat(String.valueOf(paramInt2)));
        switch (paramInt2)
        {
        default:
          paramInt1 = 14;
        case -2:
        case -3:
        case -10:
        case -11:
        case -12:
        case -13:
        case -30:
        case -40:
        case -41:
        case -42:
        case -43:
        case -1:
        }
        break;
      case -4000:
      case -4001:
      case -4002:
      case -4003:
      case -4004:
      case -4005:
      case -4999:
      }
      break;
    case 0:
    case 1:
    case 4:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    }
    while (true)
    {
      localIDKey4.SetKey(paramInt1);
      localIDKey4.SetValue(1L);
      parame = new ArrayList();
      parame.add(localIDKey1);
      parame.add(localIDKey2);
      parame.add(localIDKey3);
      parame.add(localIDKey4);
      h.pYm.b(parame, true);
      AppMethodBeat.o(105029);
      return;
      i = 62;
      break;
      i = 63;
      break;
      i = 64;
      break;
      i = 65;
      break;
      i = 66;
      break;
      i = 67;
      break;
      i = 68;
      break;
      i = 69;
      break;
      i = 70;
      break;
      paramInt1 = 3;
      break label259;
      paramInt1 = 4;
      break label259;
      paramInt1 = 5;
      break label259;
      paramInt1 = 6;
      break label259;
      paramInt1 = 7;
      break label259;
      paramInt1 = 8;
      break label259;
      paramInt1 = 9;
      break label259;
      paramInt1 = 15;
      continue;
      paramInt1 = 16;
      continue;
      paramInt1 = 17;
      continue;
      paramInt1 = 18;
      continue;
      paramInt1 = 19;
      continue;
      paramInt1 = 20;
      continue;
      paramInt1 = 21;
      continue;
      paramInt1 = 22;
      continue;
      paramInt1 = 23;
      continue;
      paramInt1 = 24;
      continue;
      paramInt1 = 25;
      continue;
      paramInt1 = 14;
    }
  }

  public final void s(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(105022);
    d.s(parame);
    AppMethodBeat.o(105022);
  }

  public final void zG(int paramInt)
  {
    AppMethodBeat.i(105028);
    if ((paramInt == 300) || (paramInt == 301) || (paramInt == 302) || (paramInt == 303))
    {
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(558);
      localIDKey.SetKey(15);
      localIDKey.SetValue(1L);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localIDKey);
      h.pYm.b(localArrayList, true);
    }
    AppMethodBeat.o(105028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.d.e
 * JD-Core Version:    0.6.2
 */