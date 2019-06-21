package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.plugin.wenote.model.a.c;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView;
import com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class o extends i
{
  private LinearLayout gCe;
  private final ak uNR;
  public LinearLayout uUj;
  public LinearLayout uUk;
  public ImageView uUm;
  private TextView uUn;
  private TextView uUo;
  private l uUp;
  public NoteVoiceView uVe;

  public o(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27186);
    this.uNR = new o.2(this);
    this.gCe = ((LinearLayout)paramView.findViewById(2131826391));
    this.uUj = ((LinearLayout)paramView.findViewById(2131826392));
    this.uUk = ((LinearLayout)paramView.findViewById(2131826396));
    this.uUm = ((ImageView)paramView.findViewById(2131826393));
    this.uUn = ((TextView)paramView.findViewById(2131826394));
    this.uUo = ((TextView)paramView.findViewById(2131826395));
    this.uVe = ((NoteVoiceView)paramView.findViewById(2131826397));
    this.uVe.setVoiceHelper(com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.dfY());
    this.gCe.setVisibility(0);
    this.uUj.setVisibility(8);
    this.uUk.setVisibility(0);
    this.cAw.setVisibility(8);
    this.uUB.setVisibility(8);
    this.gCe.setOnClickListener(new o.1(this));
    AppMethodBeat.o(27186);
  }

  public final void a(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27187);
    this.uUp = ((l)paramc);
    if (this.uUp.uOp)
    {
      this.gCe.setBackgroundResource(0);
      this.uUk.setVisibility(0);
      this.uUj.setVisibility(8);
      this.gCe.setPadding(0, 0, 0, 0);
      if (!paramc.uOa)
        break label591;
    }
    label306: label319: label591: for (int i = 1; ; i = 0)
    {
      Object localObject1 = this.uVe;
      Object localObject2 = this.uUp.cHg;
      int j = this.uUp.cAO;
      int k = this.uUp.cAP;
      ((NoteVoiceView)localObject1).path = bo.bc((String)localObject2, "");
      ((NoteVoiceView)localObject1).cAO = j;
      ((NoteVoiceView)localObject1).duration = k;
      if (i != 0)
      {
        ((NoteVoiceView)localObject1).iVh.setVisibility(0);
        if (!((NoteVoiceView)localObject1).path.equals(((NoteVoiceView)localObject1).uVk.path))
          break label319;
        if (!((NoteVoiceView)localObject1).uVk.buH())
          break label229;
        ab.i("MicroMsg.NoteVoiceView", "updateInfo .isPlay()");
        localObject2 = ((NoteVoiceView)localObject1).uVl;
        ((NoteVoiceView)localObject1).uVk.Ez();
        ((NoteVoiceView.a)localObject2).os(true);
      }
      while (true)
      {
        super.a(paramc, paramInt1, paramInt2);
        AppMethodBeat.o(27187);
        return;
        ((NoteVoiceView)localObject1).iVh.setVisibility(8);
        break;
        label229: localObject2 = ((NoteVoiceView)localObject1).uVk;
        if (((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject2).mfO == null)
          ab.w("MicroMsg.RecordVoiceHelper", "check is pause, but player is null");
        for (boolean bool = false; ; bool = ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject2).mfO.DA())
        {
          if (!bool)
            break label306;
          ab.i("MicroMsg.NoteVoiceView", "updateInfo .isPause()");
          localObject2 = ((NoteVoiceView)localObject1).uVl;
          ((NoteVoiceView)localObject1).uVk.Ez();
          ((NoteVoiceView.a)localObject2).os(false);
          break;
        }
        ((NoteVoiceView)localObject1).uVl.vD(k);
        continue;
        ((NoteVoiceView)localObject1).uVl.vD(k);
        continue;
        this.gCe.setBackgroundResource(2130840812);
        this.gCe.setPadding(26, 7, 0, 7);
        this.uUk.setVisibility(8);
        this.uUj.setVisibility(0);
        localObject2 = this.uUm;
        if (((ImageView)localObject2).getAnimation() != null)
          ((ImageView)localObject2).startAnimation(((ImageView)localObject2).getAnimation());
        while (true)
        {
          if (!this.uUp.uOh.booleanValue())
            break label529;
          this.uNR.sendEmptyMessage(4096);
          this.uUn.setText(2131299770);
          localObject1 = " " + com.tencent.mm.bk.a.B(ah.getContext(), this.uUp.uOB).toString();
          this.uUo.setText((CharSequence)localObject1);
          break;
          localObject1 = new AlphaAnimation(1.0F, 0.0F);
          ((Animation)localObject1).setDuration(500L);
          ((Animation)localObject1).setInterpolator(new LinearInterpolator());
          ((Animation)localObject1).setRepeatCount(-1);
          ((Animation)localObject1).setRepeatMode(2);
          ((ImageView)localObject2).startAnimation((Animation)localObject1);
        }
        this.uUn.setText(2131299769);
        localObject1 = " " + com.tencent.mm.bk.a.B(ah.getContext(), (int)com.tencent.mm.bk.a.fY(this.uUp.cAP)).toString();
        this.uUo.setText((CharSequence)localObject1);
      }
    }
  }

  public final int dfW()
  {
    return 4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.o
 * JD-Core Version:    0.6.2
 */