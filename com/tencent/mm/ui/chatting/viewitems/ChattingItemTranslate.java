package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.e.f;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.neattextview.textview.view.NeatTextView.b;

public class ChattingItemTranslate extends RelativeLayout
{
  private SpannableStringBuilder vji;
  private CharacterStyle vjl;
  private int vjo;
  private MMNeat7extView zgY;
  private LinearLayout zgZ;
  private ProgressBar zha;
  private TextView zhb;
  private NeatTextView.b zhc;
  private boolean zhd;
  private GestureDetector zhe;

  public ChattingItemTranslate(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(33327);
    this.vji = new SpannableStringBuilder();
    this.vjo = 3;
    this.vjl = new ForegroundColorSpan(-5066062);
    this.zhe = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(33323);
        boolean bool;
        if (ChattingItemTranslate.a(ChattingItemTranslate.this) == null)
        {
          bool = false;
          AppMethodBeat.o(33323);
        }
        while (true)
        {
          return bool;
          bool = ChattingItemTranslate.a(ChattingItemTranslate.this).fi(ChattingItemTranslate.b(ChattingItemTranslate.this));
          AppMethodBeat.o(33323);
        }
      }
    });
    AppMethodBeat.o(33327);
  }

  private SpannableStringBuilder a(SpannableStringBuilder paramSpannableStringBuilder, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(33332);
    if ((paramSpannableStringBuilder == null) || (paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      AppMethodBeat.o(33332);
      return paramSpannableStringBuilder;
    }
    int i;
    if (paramCharSequence.length() < this.vjo)
      i = paramCharSequence.length();
    for (int j = 0; ; j = i - this.vjo)
    {
      paramSpannableStringBuilder.append(paramCharSequence).setSpan(this.vjl, j, i, 33);
      AppMethodBeat.o(33332);
      break;
      i = paramCharSequence.length();
    }
  }

  private void qz(boolean paramBoolean)
  {
    AppMethodBeat.i(33331);
    Context localContext = ah.getContext();
    if (localContext == null)
      AppMethodBeat.o(33331);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.zgY.setPadding(a.fromDPToPix(localContext, 10), a.fromDPToPix(localContext, 8), a.fromDPToPix(localContext, 10), a.fromDPToPix(localContext, 4));
        this.zgZ.setVisibility(0);
        AppMethodBeat.o(33331);
      }
      else
      {
        this.zgY.setPadding(a.fromDPToPix(localContext, 10), a.fromDPToPix(localContext, 8), a.fromDPToPix(localContext, 10), a.fromDPToPix(localContext, 8));
        this.zgZ.setVisibility(8);
        AppMethodBeat.o(33331);
      }
    }
  }

  public final void a(CharSequence paramCharSequence, ChattingItemTranslate.b paramb)
  {
    AppMethodBeat.i(33329);
    if (!bo.ac(paramCharSequence))
    {
      this.zgY.setMinWidth(a.fromDPToPix(ah.getContext(), 80));
      this.zgY.setMaxWidth(a.fromDPToPix(ah.getContext(), 259));
      this.zgY.setVisibility(0);
      if (paramb == ChattingItemTranslate.b.zhi)
      {
        this.vji.clear();
        this.zgY.ah(a(this.vji, paramCharSequence));
        this.zha.setVisibility(8);
        if (paramb != ChattingItemTranslate.b.zhj)
          break label124;
        qz(true);
      }
    }
    while (true)
    {
      setVisibility(0);
      AppMethodBeat.o(33329);
      return;
      this.zgY.ah(paramCharSequence);
      break;
      label124: qz(false);
      continue;
      if (paramb != ChattingItemTranslate.b.zhg)
      {
        this.zha.setVisibility(0);
        this.zgY.setVisibility(8);
        qz(false);
      }
    }
  }

  public final void init()
  {
    AppMethodBeat.i(33328);
    this.zgY = ((MMNeat7extView)findViewById(2131822677));
    this.zha = ((ProgressBar)findViewById(2131822676));
    this.zgZ = ((LinearLayout)findViewById(2131822678));
    this.zhb = ((TextView)findViewById(2131822680));
    this.zgY.setOnTouchListener(new f(this.zgY, new m(this.zgY.getContext())));
    AppMethodBeat.o(33328);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(33333);
    int i = paramMotionEvent.getAction();
    if ((i == 1) && (this.zhd));
    for (int j = 1; j != 0; j = 0)
    {
      ab.d("MicroMsg.ChattingItemTranslate", "ignore Action Up Event this time");
      AppMethodBeat.o(33333);
      return bool1;
    }
    if (i == 0)
      this.zhd = false;
    if ((this.zhc != null) && (this.zhe != null));
    for (boolean bool2 = this.zhe.onTouchEvent(paramMotionEvent); ; bool2 = false)
    {
      bool1 = bool2;
      if (!bool2)
        bool1 = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(33333);
      break;
    }
  }

  public void setBrandWording(String paramString)
  {
    AppMethodBeat.i(33330);
    this.zhb.setText(paramString);
    AppMethodBeat.o(33330);
  }

  public void setOnDoubleClickListener(NeatTextView.b paramb)
  {
    this.zhc = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate
 * JD-Core Version:    0.6.2
 */