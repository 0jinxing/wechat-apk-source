package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.f;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.textview.a.e;
import com.tencent.mm.ui.widget.textview.a.f;

final class al$f extends c.a
{
  View gbS;
  com.tencent.mm.ui.widget.b.a yMt;
  a.f zbi;
  ImageView zci;
  MMNeat7extView zgQ;
  ImageView zgR;
  TextView zgS;
  ViewStub zgT;
  ChattingItemTranslate zgU;
  com.tencent.mm.ui.widget.textview.a zgV;
  f zgW;
  a.e zgX;

  private static boolean dHq()
  {
    boolean bool1 = true;
    AppMethodBeat.i(33322);
    try
    {
      String str = com.tencent.mm.m.g.Nu().getValue("CellTextViewEnable");
      int i = bo.getInt(str, 1);
      boolean bool2 = com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xTY, true);
      ab.i("NeatTextView", "[isOpenNeatTextView] value:%s isNeatTextViewOpen:%s local:%s", new Object[] { str, Integer.valueOf(i), Boolean.valueOf(bool2) });
      if ((1 == i) && (bool2))
      {
        AppMethodBeat.o(33322);
        return bool1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(33322);
        bool1 = false;
        continue;
        AppMethodBeat.o(33322);
        bool1 = false;
      }
    }
  }

  public final c.a z(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(33321);
    super.eP(paramView);
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.zgQ = ((MMNeat7extView)paramView.findViewById(2131821103));
    this.zgQ.setMaxWidth((int)(com.tencent.mm.bz.a.am(this.zgQ.getContext(), 2131428222) / com.tencent.mm.ca.a.dmK()));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.gbS = paramView.findViewById(2131820581);
    this.zgT = ((ViewStub)paramView.findViewById(2131822510));
    if (paramBoolean)
    {
      this.zgR = ((ImageView)paramView.findViewById(2131822508));
      this.zgS = ((TextView)paramView.findViewById(2131822509));
    }
    while (true)
    {
      this.zgW = new f(this.zgQ, new m(this.zgQ.getContext()));
      this.zgQ.setIsOpen(dHq());
      this.zgQ.setTextCrashListener(new al.c((byte)0));
      AppMethodBeat.o(33321);
      return this;
      this.zci = ((ImageView)paramView.findViewById(2131822661));
      this.zby = ((ImageView)paramView.findViewById(2131822629));
      this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.f
 * JD-Core Version:    0.6.2
 */