package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.ui.j;
import com.tencent.mm.sdk.platformtools.ak;

public final class NoteVoiceView$a extends ak
{
  boolean isPaused;
  float mki;
  float mkj;
  int mkk;
  int mkl;

  private NoteVoiceView$a(NoteVoiceView paramNoteVoiceView)
  {
  }

  public final void Vd()
  {
    AppMethodBeat.i(27214);
    this.mkk = ((int)((1.0F - this.mkj / this.mki) * (NoteVoiceView.f(this.uVm).getWidth() - this.mkl)) + this.mkl);
    NoteVoiceView.a(this.uVm).setText(j.B(this.uVm.getContext(), (int)(this.mki - this.mkj)));
    NoteVoiceView.b(this.uVm).setText(j.B(this.uVm.getContext(), (int)this.mki));
    NoteVoiceView.d(this.uVm).setWidth(this.mkk);
    AppMethodBeat.o(27214);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27216);
    this.mkj = Math.max(0.0F, this.mkj - 0.256F);
    Vd();
    if (this.mkj <= 0.1F)
      AppMethodBeat.o(27216);
    while (true)
    {
      return;
      sendEmptyMessageDelayed(4096, 256L);
      AppMethodBeat.o(27216);
    }
  }

  @SuppressLint({"ResourceType"})
  public final void os(boolean paramBoolean)
  {
    AppMethodBeat.i(27215);
    this.mkl = a.fromDPToPix(this.uVm.getContext(), 0);
    NoteVoiceView.c(this.uVm).setImageResource(2131232106);
    NoteVoiceView.c(this.uVm).setContentDescription(this.uVm.getContext().getResources().getString(2131297015));
    Vd();
    if (paramBoolean)
    {
      NoteVoiceView.c(this.uVm).setImageResource(2131232107);
      NoteVoiceView.c(this.uVm).setContentDescription(this.uVm.getContext().getResources().getString(2131296997));
      sendEmptyMessage(4096);
    }
    AppMethodBeat.o(27215);
  }

  public final void stop()
  {
    AppMethodBeat.i(27213);
    this.isPaused = false;
    removeMessages(4096);
    vD(NoteVoiceView.e(this.uVm));
    AppMethodBeat.o(27213);
  }

  @SuppressLint({"ResourceType"})
  public final void vD(int paramInt)
  {
    AppMethodBeat.i(27212);
    this.isPaused = false;
    this.mki = b.iu(paramInt);
    this.mkj = this.mki;
    this.mkl = a.fromDPToPix(this.uVm.getContext(), 0);
    NoteVoiceView.a(this.uVm).setText(j.B(this.uVm.getContext(), (int)(this.mki - this.mkj)));
    NoteVoiceView.b(this.uVm).setText(j.B(this.uVm.getContext(), (int)this.mki));
    NoteVoiceView.c(this.uVm).setImageResource(2131232106);
    NoteVoiceView.c(this.uVm).setContentDescription(this.uVm.getContext().getResources().getString(2131297015));
    NoteVoiceView.d(this.uVm).setWidth(this.mkl);
    AppMethodBeat.o(27212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView.a
 * JD-Core Version:    0.6.2
 */