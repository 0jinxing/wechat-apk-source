package com.tencent.mm.modelvoiceaddr.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.f;
import com.tencent.mm.modelvoiceaddr.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.tools.o;

public final class b extends o
{
  public boolean gcl;
  public int gcm;
  public int gcn;
  b.a gco;
  public VoiceSearchLayout gcp;
  private VoiceSearchLayout.a gcq;

  public b()
  {
    AppMethodBeat.i(116788);
    this.gcl = true;
    this.gcq = new b.1(this);
    AppMethodBeat.o(116788);
  }

  public b(byte paramByte)
  {
    super((byte)0);
    AppMethodBeat.i(116789);
    this.gcl = true;
    this.gcq = new b.1(this);
    AppMethodBeat.o(116789);
  }

  public final void a(Activity paramActivity, Menu paramMenu)
  {
    AppMethodBeat.i(116793);
    super.a(paramActivity, paramMenu);
    if (this.gcp != null)
      this.gcp.setOnSearchListener(this.gcq);
    AppMethodBeat.o(116793);
  }

  public final void a(b.a parama)
  {
    this.gco = parama;
    this.zHa = parama;
  }

  public final boolean amG()
  {
    boolean bool1 = false;
    AppMethodBeat.i(116791);
    boolean bool2 = this.gcl;
    if (this.gcp == null)
      bool1 = true;
    ab.d("MicroMsg.VoiceSearchViewHelper", "check has voice search, Enable %B, layout is null ? %B", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
    bool1 = this.gcl;
    AppMethodBeat.o(116791);
    return bool1;
  }

  public final void amH()
  {
    AppMethodBeat.i(116792);
    ab.d("MicroMsg.VoiceSearchViewHelper", "do require voice search");
    if (this.zGZ != null)
    {
      this.zGZ.setEditTextEnabled(false);
      this.zGZ.setStatusBtnEnabled(false);
    }
    Object localObject;
    boolean bool;
    if ((this.gcp != null) && (this.gcp.getVisibility() == 8))
    {
      ab.d("MicroMsg.VoiceSearchViewHelper", "do voice search layout start");
      localObject = this.gcp;
      int i = this.gcn;
      bool = com.tencent.mm.pluginsdk.permission.b.o(((VoiceSearchLayout)localObject).getContext(), "android.permission.RECORD_AUDIO");
      ab.i("MicroMsg.VoiceSearchLayout", "summerper checkPermission checkMicrophone[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        ab.d("MicroMsg.VoiceSearchLayout", "doStart " + ((VoiceSearchLayout)localObject).cFy);
        ((VoiceSearchLayout)localObject).gbW = i;
        ((VoiceSearchLayout)localObject).cFy = true;
        ((VoiceSearchLayout)localObject).gbV = false;
        if (((VoiceSearchLayout)localObject).gbT != null)
          ((VoiceSearchLayout)localObject).gbT.amE();
        ((VoiceSearchLayout)localObject).setVisibility(0);
        ((VoiceSearchLayout)localObject).gci.ae(50L, 50L);
        ((VoiceSearchLayout)localObject).dc(true);
        ((VoiceSearchLayout)localObject).gch = 0;
        ((VoiceSearchLayout)localObject).gca = new f(new VoiceSearchLayout.4((VoiceSearchLayout)localObject), i);
        localObject = ((VoiceSearchLayout)localObject).gca;
        ab.i("MicroMsg.SceneVoiceAddr", "start record");
        if ((((f)localObject).gaL == 0) && (at.is2G(ah.getContext())))
        {
          bool = true;
          ((f)localObject).gaW = bool;
          ab.i("MicroMsg.SceneVoiceAddr", "mEnableAmrMode: %b", new Object[] { Boolean.valueOf(((f)localObject).gaW) });
          com.tencent.mm.sdk.g.d.post(new f.a((f)localObject), "SceneVoiceAddr_record");
          AppMethodBeat.o(116792);
        }
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((((VoiceSearchLayout)localObject).getContext() instanceof Activity))
        com.tencent.mm.pluginsdk.permission.b.b((Activity)((VoiceSearchLayout)localObject).getContext(), "android.permission.RECORD_AUDIO", 80);
      AppMethodBeat.o(116792);
      continue;
      AppMethodBeat.o(116792);
    }
  }

  public final void amI()
  {
    AppMethodBeat.i(116795);
    cancel();
    AppMethodBeat.o(116795);
  }

  public final void cancel()
  {
    AppMethodBeat.i(116790);
    ab.d("MicroMsg.VoiceSearchViewHelper", "do cancel");
    if (this.gcp != null)
      this.gcp.amA();
    if (this.zGZ != null)
    {
      this.zGZ.setEditTextEnabled(true);
      this.zGZ.setStatusBtnEnabled(true);
    }
    AppMethodBeat.o(116790);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(116794);
    boolean bool2;
    if (4 == paramInt)
      if ((this.gcp != null) && (this.gcp.getVisibility() == 0))
      {
        bool2 = true;
        ab.d("MicroMsg.VoiceSearchViewHelper", "on back key down, try hide voice search panel, it is visiable[%B]", new Object[] { Boolean.valueOf(bool2) });
        cancel();
        if (!bool2)
          break label78;
        AppMethodBeat.o(116794);
        bool2 = bool1;
      }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label78: ab.d("MicroMsg.VoiceSearchViewHelper", "not match key code, pass to super");
      bool2 = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(116794);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.ui.b
 * JD-Core Version:    0.6.2
 */