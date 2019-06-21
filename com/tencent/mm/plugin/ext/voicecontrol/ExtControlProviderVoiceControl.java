package com.tencent.mm.plugin.ext.voicecontrol;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.protocal.protobuf.fb;
import com.tencent.mm.protocal.protobuf.fd;
import com.tencent.mm.protocal.protobuf.fe;
import com.tencent.mm.protocal.protobuf.ff;
import com.tencent.mm.protocal.protobuf.fg;
import com.tencent.mm.protocal.protobuf.fh;
import com.tencent.mm.protocal.protobuf.fi;
import com.tencent.mm.protocal.protobuf.fj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.LinkedList;

public class ExtControlProviderVoiceControl extends ExtContentProviderBase
  implements f
{
  private static final String[] lPA = { "retCode" };
  private Context context;
  private String[] lPN;
  private int lPO;
  private int lRi;
  private long lRj;
  private long lRk;
  private long lRl;
  com.tencent.mm.pluginsdk.d.a.b lRm;
  private long lRn;
  private boolean lRo;
  private com.qq.wx.voice.embed.recognizer.c lRp;

  public ExtControlProviderVoiceControl(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    AppMethodBeat.i(20447);
    this.lPN = null;
    this.lPO = -1;
    this.lRi = 4;
    this.lRm = new com.tencent.mm.pluginsdk.d.a.b();
    this.lRn = 0L;
    this.lRp = new ExtControlProviderVoiceControl.5(this);
    this.lPN = paramArrayOfString;
    this.lPO = paramInt;
    this.context = paramContext;
    AppMethodBeat.o(20447);
  }

  private void Ln(String paramString)
  {
    AppMethodBeat.i(20453);
    aw.ZK();
    ad localad = com.tencent.mm.model.c.XM().aoO(paramString);
    if ((localad == null) || (!com.tencent.mm.n.a.jh(localad.field_type)))
    {
      ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] username is not contact, countDown");
      this.lRi = 3505;
      this.lRm.countDown();
      AppMethodBeat.o(20453);
    }
    while (true)
    {
      return;
      com.tencent.mm.compatible.a.a.a(11, new ExtControlProviderVoiceControl.6(this, paramString));
      this.lRi = 1;
      ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] jump to chattingUI : %s, countDown", new Object[] { paramString });
      this.lRm.countDown();
      AppMethodBeat.o(20453);
    }
  }

  private static boolean a(a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(20450);
    boolean bool;
    if (parama == null)
    {
      ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue netscene null");
      AppMethodBeat.o(20450);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (parama.lRA == null)
      {
        ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue uploadCmd null");
        AppMethodBeat.o(20450);
        bool = false;
      }
      else if (parama.lRA.vHg == null)
      {
        ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue UploadCtx null");
        AppMethodBeat.o(20450);
        bool = false;
      }
      else
      {
        new fh();
        Object localObject = parama.lRA;
        ((fh)localObject).vHg.ptx = paramInt1;
        ((fh)localObject).vHg.pty = paramInt2;
        byte[] arrayOfByte = e.f(parama.lRz, paramInt1, paramInt2);
        ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue %s, startPos=%s, dataLen=%s", new Object[] { Integer.valueOf(parama.lRx), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
        {
          ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty, %s", new Object[] { parama.lRz });
          AppMethodBeat.o(20450);
          bool = false;
        }
        else
        {
          ((fh)localObject).vHn = com.tencent.mm.bt.b.bI(arrayOfByte);
          localObject = new a(parama.lRx, parama.appId, parama.frO, parama.lRz, (fh)localObject);
          ((a)localObject).coc = parama.coc;
          aw.Rg().a((m)localObject, 0);
          AppMethodBeat.o(20450);
          bool = true;
        }
      }
    }
  }

  public static boolean b(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    AppMethodBeat.i(20449);
    ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "uploadVoiceStart ");
    Object localObject2;
    boolean bool;
    if (paramInt1 != 4)
    {
      localObject1 = paramString2 + ".speex";
      new com.tencent.mm.audio.d.d();
      localObject2 = localObject1;
      if (!com.tencent.mm.audio.d.d.G(paramString2, (String)localObject1))
      {
        ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] decodePCMToSpeex error,pcmPath:%s,speexFilePath:%s", new Object[] { paramString2, localObject1 });
        bool = false;
        AppMethodBeat.o(20449);
        return bool;
      }
    }
    else
    {
      localObject2 = paramString2;
    }
    int i = e.cs((String)localObject2);
    fj localfj = new fj();
    localfj.vHo = 4;
    localfj.vHp = 4;
    localfj.vHq = paramInt3;
    localfj.vHr = paramInt4;
    Object localObject1 = new fi();
    ((fi)localObject1).ptw = i;
    ((fi)localObject1).ptx = 0;
    if (i <= 16384)
      ((fi)localObject1).pty = i;
    for (paramString2 = e.f((String)localObject2, 0, i); ; paramString2 = e.f((String)localObject2, 0, 16384))
    {
      ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoice appId=%s, FileType=%s, EncodeType=%s, sampleRate=%s, bps=%s, fileLen=%s, limit=%s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(i), Integer.valueOf(16384) });
      if ((paramString2 != null) && (paramString2.length > 0))
        break label307;
      ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty");
      bool = false;
      AppMethodBeat.o(20449);
      break;
      ((fi)localObject1).pty = 16384;
    }
    label307: fh localfh = new fh();
    localfh.vHm = localfj;
    localfh.vHg = ((fi)localObject1);
    localfh.vHn = com.tencent.mm.bt.b.bI(paramString2);
    paramInt1 = bo.anU().hashCode();
    if (paramInt1 != -2147483648);
    for (paramInt1 = Math.abs(paramInt1); ; paramInt1 = -2147483648)
    {
      paramString1 = new a(paramInt1, paramString1, i, (String)localObject2, localfh);
      aw.Rg().a(paramString1, 0);
      bool = true;
      AppMethodBeat.o(20449);
      break;
    }
  }

  public final boolean a(int paramInt, String paramString, com.tencent.mm.bt.b paramb)
  {
    AppMethodBeat.i(20451);
    ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getVoiceControlResult voiceId=%s, appId=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (this.lRk == 0L)
      this.lRk = System.currentTimeMillis();
    this.lRl = System.currentTimeMillis();
    fb localfb = new fb();
    localfb.vGZ = paramb;
    paramString = new a(paramInt, paramString, localfb, this.lRk);
    aw.Rg().a(paramString, 0);
    AppMethodBeat.o(20451);
    return true;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20452);
    ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] onSceneEnd errType=%s, errCode=%s, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramm == null)
    {
      ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene null, countDown");
      this.lRi = 3506;
      this.lRm.countDown();
      AppMethodBeat.o(20452);
    }
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] errType、errCode not ok, countDown");
        this.lRi = 3507;
        this.lRm.countDown();
        AppMethodBeat.o(20452);
      }
      else
      {
        ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene.getType()=%s", new Object[] { Integer.valueOf(paramm.getType()) });
        if (paramm.getType() == 985)
        {
          if (this.lRo)
          {
            ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] localVoiceControlSucess, no need to process");
            AppMethodBeat.o(20452);
          }
          else
          {
            a locala = (a)paramm;
            paramString = (a)paramm;
            if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
            for (paramString = (fd)paramString.ehh.fsH.fsP; ; paramString = null)
            {
              if (paramString != null)
                break label254;
              ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp null, countDown");
              this.lRi = 3508;
              this.lRm.countDown();
              AppMethodBeat.o(20452);
              break;
            }
            label254: locala.lRy = paramString.vGZ;
            paramInt1 = locala.czE;
            if (paramString.vGZ == null)
            {
              paramm = "null";
              label281: ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] opCode=%s, resp.Cookies=%s", new Object[] { Integer.valueOf(paramInt1), paramm });
              if (locala.czE != 1)
                break label377;
              paramInt1 = 1;
            }
            while (true)
              if (paramInt1 != 0)
              {
                if (paramString.vHg == null)
                {
                  ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp.UploadCtx is null");
                  this.lRi = 3508;
                  this.lRm.countDown();
                  AppMethodBeat.o(20452);
                  break;
                  paramm = new String(paramString.vGZ.wR);
                  break label281;
                  label377: paramInt1 = 0;
                  continue;
                }
                ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadMode resp: Interval=%s, Timeout=%s, StartPos=%s, DataLen=%s", new Object[] { Integer.valueOf(paramString.vHe), Integer.valueOf(paramString.vHf), Integer.valueOf(paramString.vHg.ptx), Integer.valueOf(paramString.vHg.pty) });
                if (paramString.vHg.ptx >= locala.frO)
                {
                  al.n(new ExtControlProviderVoiceControl.2(this, locala, paramString), paramString.vHe);
                  AppMethodBeat.o(20452);
                  break;
                }
                ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] continue upload voice");
                if ((paramString.vHg.ptx != 0) && (paramString.vHg.ptx == locala.coc))
                {
                  ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] avoid duplicate doscene");
                  AppMethodBeat.o(20452);
                  break;
                }
                locala.coc = paramString.vHg.ptx;
                if (paramString.vHg.ptx + paramString.vHg.pty < locala.frO)
                {
                  if (a(locala, paramString.vHg.ptx, paramString.vHg.pty))
                    break label680;
                  ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail1, countDown");
                  this.lRi = 3510;
                  this.lRm.countDown();
                  AppMethodBeat.o(20452);
                  break;
                }
                if (!a(locala, paramString.vHg.ptx, locala.frO - paramString.vHg.ptx))
                {
                  ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail2, countDown");
                  this.lRi = 3510;
                  this.lRm.countDown();
                  AppMethodBeat.o(20452);
                  break;
                }
                label680: AppMethodBeat.o(20452);
                break;
              }
            label700: long l1;
            if (locala.czE == 2)
            {
              paramInt1 = 1;
              if (paramInt1 == 0)
                break label1364;
              ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "");
              l1 = System.currentTimeMillis() - locala.lRD;
              if (l1 <= locala.lRC)
                break label801;
              ab.w("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] isGetResultTimeOut %s, %s", new Object[] { Long.valueOf(l1), Integer.valueOf(locala.lRC) });
            }
            for (paramInt1 = 1; ; paramInt1 = 0)
            {
              if (paramInt1 == 0)
                break label838;
              this.lRi = 3509;
              this.lRm.countDown();
              AppMethodBeat.o(20452);
              break;
              paramInt1 = 0;
              break label700;
              label801: ab.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] time %s, %s", new Object[] { Long.valueOf(l1), Integer.valueOf(locala.lRC) });
            }
            label838: if (paramString.vHh != null)
              ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode resp VoiceId=%s, RecognizeRet=%s", new Object[] { Integer.valueOf(paramString.vHh.vHa), Integer.valueOf(paramString.vHh.vHi) });
            if ((paramString.vHh == null) || (paramString.vHh.vHi != 0))
            {
              if (System.currentTimeMillis() - this.lRl >= paramString.vHe)
              {
                al.d(new ExtControlProviderVoiceControl.3(this, locala));
                AppMethodBeat.o(20452);
              }
              else
              {
                long l2 = paramString.vHe - (System.currentTimeMillis() - this.lRl);
                l1 = l2;
                if (l2 > paramString.vHe)
                  l1 = paramString.vHe;
                al.n(new ExtControlProviderVoiceControl.4(this, locala), l1);
                AppMethodBeat.o(20452);
              }
            }
            else if (paramString.vHh.vHj == null)
            {
              ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo null, countDown");
              this.lRi = 3511;
              this.lRm.countDown();
              AppMethodBeat.o(20452);
            }
            else if ((paramString.vHh.vHj.vHk == null) || (paramString.vHh.vHj.vHk.size() <= 0))
            {
              ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo.Items null, countDown");
              this.lRi = 3511;
              this.lRm.countDown();
              AppMethodBeat.o(20452);
            }
            else if (paramString.vHh.vHj.vHk.size() == 0)
            {
              this.lRi = 3511;
              this.lRm.countDown();
              AppMethodBeat.o(20452);
            }
            else if (paramString.vHh.vHj.vHk.size() == 1)
            {
              Ln(((fg)paramString.vHh.vHj.vHk.get(0)).vHl);
              AppMethodBeat.o(20452);
            }
            else
            {
              paramm = new String[paramString.vHh.vHj.vHk.size()];
              for (paramInt1 = 0; paramInt1 < paramm.length; paramInt1++)
              {
                paramm[paramInt1] = ((fg)paramString.vHh.vHj.vHk.get(paramInt1)).vHl;
                ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp result item: %s", new Object[] { paramm[paramInt1] });
              }
              paramString = new Intent();
              paramString.putExtra("VoiceSearchResultUI_Resultlist", paramm);
              paramString.putExtra("VoiceSearchResultUI_VoiceId", locala.lRx);
              paramString.putExtra("VoiceSearchResultUI_IsVoiceControl", true);
              paramString.setFlags(67108864);
              paramString.putExtra("VoiceSearchResultUI_ShowType", 1);
              com.tencent.mm.bp.d.f(this.context, ".ui.voicesearch.VoiceSearchResultUI", paramString);
              ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene end countDown");
              this.lRi = 1;
              this.lRm.countDown();
              AppMethodBeat.o(20452);
            }
          }
        }
        else
          label1364: AppMethodBeat.o(20452);
      }
    }
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    AppMethodBeat.i(20448);
    ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] query(), ApiId=%s", new Object[] { Integer.valueOf(this.lPO) });
    this.lRj = 0L;
    this.lRk = 0L;
    a(paramUri, this.context, this.lPO, this.lPN);
    if (paramUri == null)
    {
      ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "uri == null");
      dZ(3, 5);
      paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(5);
      AppMethodBeat.o(20448);
    }
    while (true)
    {
      return paramUri;
      long l1 = System.currentTimeMillis();
      if (bo.isNullOrNil(this.lPW))
      {
        ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "AppID == null");
        dZ(3, 7);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(7);
        AppMethodBeat.o(20448);
      }
      else if (bo.isNullOrNil(brL()))
      {
        ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "PkgName == null");
        dZ(3, 6);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(6);
        AppMethodBeat.o(20448);
      }
      else
      {
        long l2 = System.currentTimeMillis();
        long l3 = System.currentTimeMillis();
        long l4 = System.currentTimeMillis();
        int i = brM();
        if (i != 1)
        {
          ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "invalid appid ! return code = ".concat(String.valueOf(i)));
          dZ(2, i);
          paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(i);
          AppMethodBeat.o(20448);
        }
        else
        {
          ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] getAppIdAndPkg = %s, checkIsLogin = %s", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(l4 - l3) });
          switch (this.lPO)
          {
          default:
            dZ(3, 15);
            paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(15);
            AppMethodBeat.o(20448);
            break;
          case 29:
            ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "voiceControl");
            if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 4))
            {
              ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
              dZ(3, 3501);
              this.lRi = 3501;
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3501);
              AppMethodBeat.o(20448);
            }
            else
            {
              paramArrayOfString1 = paramArrayOfString2[0];
              paramString2 = paramArrayOfString2[1];
              paramString1 = paramArrayOfString2[2];
              paramUri = paramArrayOfString2[3];
              paramArrayOfString2 = paramArrayOfString2[4];
              ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] args: %s, %s, %s, %s %s", new Object[] { paramArrayOfString1, paramString2, paramString1, paramUri, paramArrayOfString2 });
              if ((bo.isNullOrNil(paramArrayOfString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramUri)) || (bo.isNullOrNil(paramArrayOfString2)))
              {
                dZ(3, 3502);
                ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3502);
                AppMethodBeat.o(20448);
              }
              else
              {
                if (e.ct(paramArrayOfString2))
                  break label543;
                ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] speex file not exist");
                dZ(3, 3503);
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3503);
                AppMethodBeat.o(20448);
              }
            }
            break;
          }
        }
      }
    }
    label543: this.lRj = System.currentTimeMillis();
    aw.Rg().a(985, this);
    this.lRm.b(13000L, new ExtControlProviderVoiceControl.1(this, paramArrayOfString1, paramArrayOfString2, paramString2, paramString1, paramUri));
    ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] finish uploadVoice = %s, getResult = %s", new Object[] { Long.valueOf(this.lRk - this.lRj), Long.valueOf(System.currentTimeMillis() - this.lRk) });
    aw.Rg().b(985, this);
    T(10, 0, 1);
    if (1 != this.lRi)
      T(11, 4, 1);
    while (true)
    {
      vf(0);
      paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(this.lRi);
      AppMethodBeat.o(20448);
      break;
      T(10, 0, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl
 * JD-Core Version:    0.6.2
 */