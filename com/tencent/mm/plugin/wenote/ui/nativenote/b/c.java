package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends i
{
  private final ak uNR;
  public LinearLayout uUj;
  public LinearLayout uUk;
  public NoteEditorVoiceBaseView uUl;
  public ImageView uUm;
  private TextView uUn;
  private TextView uUo;
  private l uUp;

  public c(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27153);
    this.uNR = new c.2(this);
    this.uUj = ((LinearLayout)paramView.findViewById(2131826392));
    this.uUk = ((LinearLayout)paramView.findViewById(2131826398));
    this.uUm = ((ImageView)paramView.findViewById(2131826393));
    this.uUn = ((TextView)paramView.findViewById(2131826394));
    this.uUo = ((TextView)paramView.findViewById(2131826395));
    this.uUl = ((NoteEditorVoiceBaseView)paramView.findViewById(2131826399));
    com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.dfY().a(this.uUl);
    this.gCe.setVisibility(0);
    this.uUj.setVisibility(8);
    this.uUk.setVisibility(0);
    this.cAw.setVisibility(8);
    this.uUB.setVisibility(8);
    this.gCe.setOnClickListener(new c.1(this));
    AppMethodBeat.o(27153);
  }

  public final void a(com.tencent.mm.plugin.wenote.model.a.c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27154);
    this.uUp = ((l)paramc);
    Object localObject1;
    Object localObject2;
    if (this.uUp.uOp)
    {
      this.uUk.setVisibility(0);
      this.uUj.setVisibility(8);
      this.gCe.setPadding(0, 0, 0, 0);
      if (paramc.uOa)
      {
        this.uUl.setBackgroundResource(2130840796);
        localObject1 = this.uUl;
        localObject2 = this.uUp.cHg;
        int i = this.uUp.cAO;
        String str = this.uUp.uOC;
        ((NoteEditorVoiceBaseView)localObject1).path = bo.bc((String)localObject2, "");
        ((NoteEditorVoiceBaseView)localObject1).cAO = i;
        ((NoteEditorVoiceBaseView)localObject1).setText(str);
      }
    }
    while (true)
    {
      super.a(paramc, paramInt1, paramInt2);
      AppMethodBeat.o(27154);
      return;
      this.uUl.setBackgroundResource(2130840795);
      break;
      this.gCe.setPadding(26, 7, 0, 7);
      this.uUk.setVisibility(8);
      this.uUj.setVisibility(0);
      localObject1 = this.uUm;
      if (((ImageView)localObject1).getAnimation() != null)
        ((ImageView)localObject1).startAnimation(((ImageView)localObject1).getAnimation());
      while (true)
      {
        if (!this.uUp.uOh.booleanValue())
          break label341;
        this.uNR.sendEmptyMessage(4096);
        this.uUn.setText(2131299770);
        localObject1 = " " + com.tencent.mm.bk.a.B(ah.getContext(), this.uUp.uOB).toString();
        this.uUo.setText((CharSequence)localObject1);
        break;
        localObject2 = new AlphaAnimation(1.0F, 0.0F);
        ((Animation)localObject2).setDuration(500L);
        ((Animation)localObject2).setInterpolator(new LinearInterpolator());
        ((Animation)localObject2).setRepeatCount(-1);
        ((Animation)localObject2).setRepeatMode(2);
        ((ImageView)localObject1).startAnimation((Animation)localObject2);
      }
      label341: this.uUn.setText(2131299769);
      localObject1 = " " + com.tencent.mm.bk.a.B(ah.getContext(), (int)com.tencent.mm.bk.a.fY(this.uUp.cAP)).toString();
      this.uUo.setText((CharSequence)localObject1);
    }
  }

  public final int dfW()
  {
    return 20;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.c
 * JD-Core Version:    0.6.2
 */