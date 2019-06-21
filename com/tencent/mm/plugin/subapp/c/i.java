package com.tencent.mm.plugin.subapp.c;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.ai.j.b;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class i
  implements com.tencent.mm.ai.j, g.a
{
  private static int cri = 100;
  private com.tencent.mm.modelvoice.k chd;
  private String fileName;
  private int jJI;
  private long ljM;
  protected j.b stf;
  protected j.a stg;
  private boolean sth;
  private i.a sti;
  private long stj;
  private int stk;
  private ap stl;

  public i()
  {
    AppMethodBeat.i(25298);
    this.chd = null;
    this.stg = null;
    this.jJI = 0;
    this.fileName = "";
    this.sth = false;
    this.ljM = 0L;
    this.stj = 0L;
    this.stk = 0;
    this.stl = new ap(new i.1(this), true);
    AppMethodBeat.o(25298);
  }

  public final boolean EH()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(25303);
    aw.ZL().KN();
    ab.d("MicroMsg.VoiceRemindRecorder", "stop Record :" + this.fileName);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("stop synchronized Record :");
      ab.d("MicroMsg.VoiceRemindRecorder", this.fileName);
      if (this.chd != null)
        this.chd.EB();
      if (this.stk != 2)
      {
        h.uS(this.fileName);
        this.fileName = null;
        ab.d("MicroMsg.VoiceRemindRecorder", "Stop " + this.fileName + " by not onPart: " + bo.az(this.stj));
        this.stk = -1;
        AppMethodBeat.o(25303);
        return bool2;
      }
    }
    finally
    {
      AppMethodBeat.o(25303);
    }
    this.jJI = ((int)EV());
    if ((this.jJI < 800L) || (this.jJI < 1000L))
    {
      ab.d("MicroMsg.VoiceRemindRecorder", "Stop " + this.fileName + " by voiceLen: " + this.jJI);
      h.uS(this.fileName);
      this.fileName = "";
    }
    String str;
    int i;
    g localg;
    for (bool2 = false; ; bool2 = bool1)
    {
      this.fileName = "";
      break;
      str = this.fileName;
      i = this.jJI;
      if (str != null)
      {
        ab.d("MicroMsg.VoiceRemindLogic", "StopRecord fileName[" + str + "]");
        localg = d.cDE().abp(str);
        if (localg != null)
        {
          if ((localg.field_status != 97) && (localg.field_status != 98))
            localg.field_status = 3;
          localg.field_totallen = c.uj(h.by(str, false));
          if (localg.field_totallen > 0)
            break label404;
          h.um(str);
        }
      }
      d.cDF().run();
      ab.d("MicroMsg.VoiceRemindRecorder", "Stop file success: " + this.fileName);
    }
    label404: localg.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localg.field_voicelenght = i;
    localg.bJt = 3424;
    bi localbi = new bi();
    localbi.ju(localg.field_user);
    localbi.setType(34);
    localbi.hO(1);
    localbi.jv(str);
    if (localg.field_status == 97)
    {
      localbi.setStatus(2);
      localbi.setContent(f.d(localg.field_human, localg.field_voicelenght, false));
    }
    while (true)
    {
      localbi.eJ(bf.oC(localg.field_user));
      localg.field_msglocalid = ((int)bf.l(localbi));
      h.a(localg);
      break;
      if (localg.field_status == 98)
      {
        localbi.setStatus(5);
        localbi.setContent(f.d(localg.field_human, -1L, true));
      }
      else
      {
        localbi.setStatus(1);
      }
    }
  }

  public final int ET()
  {
    return this.jJI;
  }

  public final long EV()
  {
    long l = 0L;
    AppMethodBeat.i(25304);
    if (this.ljM <= 0L)
      AppMethodBeat.o(25304);
    while (true)
    {
      return l;
      l = bo.az(this.ljM);
      AppMethodBeat.o(25304);
    }
  }

  public final int EY()
  {
    return 0;
  }

  public final void a(j.a parama)
  {
    this.stg = parama;
  }

  public final void a(j.b paramb)
  {
    this.stf = paramb;
  }

  public final boolean cancel()
  {
    AppMethodBeat.i(25302);
    ab.d("MicroMsg.VoiceRemindRecorder", "cancel Record :" + this.fileName);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("stop synchronized Record :");
      ab.d("MicroMsg.VoiceRemindRecorder", this.fileName);
      if (this.chd != null)
        this.chd.EB();
      String str = this.fileName;
      if (str != null)
      {
        ab.d("MicroMsg.VoiceRemindLogic", "Mark Canceled fileName[" + str + "]");
        localObject1 = d.cDE().abp(str);
        if (localObject1 != null)
        {
          ((g)localObject1).field_status = 8;
          ((g)localObject1).field_totallen = c.uj(h.by(str, false));
          ((g)localObject1).bJt = 64;
          h.a((g)localObject1);
        }
      }
      d.cDF().run();
      this.fileName = "";
      AppMethodBeat.o(25302);
      return true;
    }
    finally
    {
      AppMethodBeat.o(25302);
    }
  }

  public final boolean em(String paramString)
  {
    AppMethodBeat.i(25301);
    String str = k.ug(r.Yz());
    Object localObject = new g();
    ((g)localObject).field_filename = str;
    ((g)localObject).field_user = paramString;
    ((g)localObject).field_createtime = (System.currentTimeMillis() / 1000L);
    ((g)localObject).field_clientid = str;
    ((g)localObject).field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    ((g)localObject).field_status = 1;
    ((g)localObject).field_human = r.Yz();
    ((g)localObject).bJt = -1;
    paramString = d.cDE();
    ab.d("MicroMsg.VoiceRemindStorage", "VoiceRemindStorage Insert");
    localObject = ((g)localObject).Hl();
    int i = (int)paramString.bSd.insert("VoiceRemindInfo", "", (ContentValues)localObject);
    ab.d("MicroMsg.VoiceRemindStorage", "VoiceRemindStorage Insert result".concat(String.valueOf(i)));
    paramString = str;
    if (i == -1)
      paramString = null;
    this.fileName = paramString;
    aw.ZL().a(this);
    i = aw.ZL().KM();
    this.sth = false;
    if (i != 0)
      gE(100);
    while (true)
    {
      AppMethodBeat.o(25301);
      return false;
      new i.3(this).sendEmptyMessageDelayed(0, 50L);
    }
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(25299);
    ab.d("MicroMsg.VoiceRemindRecorder", " Recorder onBluetoothHeadsetStateChange :".concat(String.valueOf(paramInt)));
    if (this.sth)
      AppMethodBeat.o(25299);
    while (true)
    {
      return;
      this.sth = true;
      aw.ZL().b(this);
      this.chd = new com.tencent.mm.modelvoice.k();
      new i.2(this);
      this.sti = new i.a(this);
      com.tencent.mm.sdk.g.d.post(this.sti, "VoiceRemindRecorder_record");
      this.stk = 1;
      this.stl.ae(3000L, 3000L);
      ab.d("MicroMsg.VoiceRemindRecorder", "start end time:" + bo.az(this.stj));
      AppMethodBeat.o(25299);
    }
  }

  public final String getFileName()
  {
    return this.fileName;
  }

  public final int getMaxAmplitude()
  {
    AppMethodBeat.i(25300);
    int i;
    if (this.chd != null)
    {
      i = this.chd.getMaxAmplitude();
      if (i > cri)
        cri = i;
      ab.d("getMaxAmplitude", " map: " + i + " max:" + cri + " per:" + i * 100 / cri);
      i = i * 100 / cri;
      AppMethodBeat.o(25300);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(25300);
    }
  }

  public final boolean isRecording()
  {
    boolean bool = false;
    if (this.chd == null);
    while (true)
    {
      return bool;
      if (this.chd.mStatus == 1)
        bool = true;
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(25305);
    if (this.chd != null)
    {
      this.chd.EB();
      ab.e("MicroMsg.VoiceRemindRecorder", "Reset recorder.stopReocrd");
    }
    this.fileName = "";
    this.stj = 0L;
    this.sti = null;
    this.stk = 0;
    this.ljM = 0L;
    AppMethodBeat.o(25305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.i
 * JD-Core Version:    0.6.2
 */