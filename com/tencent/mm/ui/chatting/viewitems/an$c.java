package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.pluginsdk.ui.e;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.AnimImageView;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.TextPreviewUI;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.c.b.f;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d;

public final class an$c extends c.a
{
  TextView zbU;
  ImageView zci;
  TextView zfC;
  ViewStub zgT;
  ChattingItemTranslate zgU;
  TextView zhA;
  TextView zhB;
  AnimImageView zhC;
  FrameLayout zhD;
  FrameLayout zhE;
  ImageView zhF;
  AnimImageView zhG;
  ProgressBar zhH;
  TextView zhI;
  Animation zhJ;
  int zhz;

  private static void a(c paramc, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(33377);
    paramc.zby.setVisibility(paramInt2);
    paramc.zfC.setVisibility(paramInt2);
    paramc.zhD.setVisibility(paramInt2);
    if (paramBoolean)
    {
      paramc.zhG.setVisibility(paramInt1);
      paramc.zbU.setVisibility(paramInt2);
      AppMethodBeat.o(33377);
    }
    while (true)
    {
      return;
      paramc.zhI.setVisibility(paramInt1);
      AppMethodBeat.o(33377);
    }
  }

  public static void a(c paramc, bi parambi, int paramInt, com.tencent.mm.ui.chatting.d.a parama, boolean paramBoolean, View.OnLongClickListener paramOnLongClickListener)
  {
    AppMethodBeat.i(33374);
    if (paramc == null)
    {
      AppMethodBeat.o(33374);
      return;
    }
    Object localObject = new n(parambi.field_content);
    float f1 = q.fY(((n)localObject).time);
    d locald = ((aj)parama.aF(aj.class)).dFm();
    label87: label220: float f2;
    if ((locald != null) && (parambi.field_msgId == locald.yGO))
    {
      paramc.zhC.setVisibility(0);
      paramc.zhC.dzr();
      if (parambi.field_isSend != 0)
        break label731;
      if (((n)localObject).time != 0L)
        break label527;
      a(paramc, 8, 0, true);
      paramc.zhG.ceT();
      paramc.zhG.setVisibility(8);
      paramc.zby.setVisibility(8);
      f1 = 0.0F;
      paramc.zhz = com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), yr(0));
      paramc.zhB.setWidth(paramc.zhz);
      paramc.zfC.setText(parama.yTx.getMMResources().getString(2131300005, new Object[] { Integer.valueOf(0) }));
      paramc.zhC.setWidth(com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), yr(0)));
      f2 = f1;
      if (1 != parambi.field_isSend)
        break label1026;
      if (parambi.field_status != 1)
        break label734;
      a(paramc, 0, 8, false);
      paramc.zhE.setVisibility(8);
      paramc.dHs();
      label261: localObject = ((com.tencent.mm.ui.chatting.c.b.c)parama.aF(com.tencent.mm.ui.chatting.c.b.c.class)).dDJ();
      if (localObject != null)
      {
        if (!((e)localObject).vhc)
          break label1033;
        paramc.zfC.setShadowLayer(2.0F, 1.2F, 1.2F, ((e)localObject).vhd);
        label307: if (!((e)localObject).vhe)
          break label1047;
        paramc.zfC.setBackgroundResource(2130838319);
      }
      label324: localObject = new ChattingItemTranslate.a(parambi, parama.dFx(), paramInt);
      paramc.zhB.setTag(localObject);
      paramc.zhB.setOnClickListener(paramc.zbA.d(parama));
      paramc.zhB.setOnLongClickListener(paramOnLongClickListener);
      paramc.zhB.setOnTouchListener(((h)parama.aF(h.class)).dCZ());
      if ((parambi.dqI & 0x1) != 1)
        break label1081;
      paramc.zhA.setVisibility(0);
      if (parambi.field_isSend != 0)
        break label1058;
      paramc.zhC.setBackgroundResource(2130838234);
      label428: if (!paramBoolean)
        break label1133;
      parama.getTalkerUserName();
    }
    while (true)
    {
      parama = ((f)parama.aF(f.class)).arj(parama.getTalkerUserName());
      parambi = a.a.dzk();
      paramOnLongClickListener = paramc.zhB;
      paramInt = (int)f1;
      if (parama != null)
        parama.toString();
      parambi.ah(paramOnLongClickListener, paramInt);
      paramc.zfC.setContentDescription(" ");
      AppMethodBeat.o(33374);
      break;
      paramc.zhC.setVisibility(8);
      paramc.zhC.ceT();
      break label87;
      label527: if (((n)localObject).time == -1L)
      {
        a(paramc, 8, 0, true);
        paramc.zhG.ceT();
        paramc.zhG.setVisibility(8);
        paramc.zhz = 80;
        paramc.zhB.setWidth(80);
        paramc.zfC.setVisibility(8);
        paramc.zhC.setWidth(com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), yr((int)f1)));
        break label220;
      }
      a(paramc, 8, 0, true);
      paramc.zhG.ceT();
      paramc.zhG.setVisibility(8);
      paramc.zfC.setVisibility(0);
      paramc.zhz = com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), yr((int)f1));
      paramc.zhB.setWidth(paramc.zhz);
      paramc.zfC.setText(parama.yTx.getMMResources().getString(2131300005, new Object[] { Integer.valueOf((int)f1) }));
      paramc.zhC.setWidth(com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), yr((int)f1)));
      label731: break label220;
      label734: if (((n)localObject).time == -1L)
      {
        a(paramc, 8, 0, false);
        paramc.zhB.setWidth(80);
        paramc.zhz = 80;
        paramc.zfC.setVisibility(8);
        paramc.zhE.setVisibility(8);
        paramc.zhC.setWidth(com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), yr((int)f1)));
        paramc.dHs();
        break label261;
      }
      if (parambi.field_status == 7)
      {
        a(paramc, 8, 8, false);
        paramc.zfC.setVisibility(8);
        paramc.zhE.setVisibility(0);
        paramc.dHs();
        if (paramc.zhF != null)
        {
          paramc.zhJ = AnimationUtils.loadAnimation(paramc.mRR.getContext(), 2131034288);
          paramc.zhF.startAnimation(paramc.zhJ);
        }
        break label261;
      }
      a(paramc, 8, 0, false);
      paramc.zhE.setVisibility(8);
      paramc.zfC.setVisibility(0);
      paramc.dHs();
      if (((n)localObject).time == 0L)
        f1 = 0.0F;
      paramc.zhz = com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), yr((int)f1));
      paramc.zhB.setWidth(paramc.zhz);
      paramc.zfC.setText(parama.yTx.getMMResources().getString(2131300005, new Object[] { Integer.valueOf((int)f1) }));
      paramc.zhC.setWidth(com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), yr((int)f1)));
      f2 = f1;
      label1026: f1 = f2;
      break label261;
      label1033: paramc.zfC.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      break label307;
      label1047: paramc.zfC.setBackgroundColor(0);
      break label324;
      label1058: paramc.zhI.setBackgroundResource(2130838325);
      paramc.zhC.setBackgroundResource(2130838325);
      break label428;
      label1081: paramc.zhA.setVisibility(8);
      if (parambi.field_isSend == 0)
      {
        paramc.zhC.setBackgroundResource(2130838217);
        break label428;
      }
      paramc.zhI.setBackgroundResource(2130838320);
      paramc.zhC.setBackgroundResource(2130838320);
      break label428;
      label1133: parama.dFu();
    }
  }

  private void dHs()
  {
    AppMethodBeat.i(33376);
    if (this.zhJ != null)
    {
      this.zhJ.cancel();
      this.zhJ = null;
    }
    AppMethodBeat.o(33376);
  }

  static void f(Context paramContext, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(33375);
    Intent localIntent = new Intent(paramContext, TextPreviewUI.class);
    localIntent.putExtra("key_chat_text", paramCharSequence);
    paramContext.startActivity(localIntent);
    b.hL(paramContext);
    AppMethodBeat.o(33375);
  }

  private static int yr(int paramInt)
  {
    if (paramInt <= 2)
      paramInt = 80;
    while (true)
    {
      return paramInt;
      if (paramInt < 10)
        paramInt = (paramInt - 2) * 9 + 80;
      else if (paramInt < 60)
        paramInt = (paramInt / 10 + 7) * 9 + 80;
      else
        paramInt = 204;
    }
  }

  public final c.a d(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(33373);
    super.eP(paramView);
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.zhB = ((TextView)paramView.findViewById(2131822627));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.zby = ((ImageView)paramView.findViewById(2131822629));
    this.zfC = ((TextView)paramView.findViewById(2131821103));
    this.zhD = ((FrameLayout)paramView.findViewById(2131822626));
    this.zgT = ((ViewStub)paramView.findViewById(2131822510));
    this.zhA = ((TextView)paramView.findViewById(2131822623));
    this.zhC = ((AnimImageView)paramView.findViewById(2131822628));
    this.zhC.setType(1);
    if (paramBoolean1)
    {
      this.zhC.setFromVoice(true);
      this.zhC.setFromGroup(paramBoolean2);
      this.zbU = ((TextView)paramView.findViewById(2131822454));
      this.zhG = ((AnimImageView)paramView.findViewById(2131822624));
      this.zhG.setFromVoice(true);
      this.zhG.setFromGroup(paramBoolean2);
      this.zhG.setType(0);
    }
    while (true)
    {
      AppMethodBeat.o(33373);
      return this;
      this.zhE = ((FrameLayout)paramView.findViewById(2131822672));
      this.zhF = ((ImageView)paramView.findViewById(2131822673));
      this.zhH = ((ProgressBar)paramView.findViewById(2131822671));
      this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
      this.zhI = ((TextView)paramView.findViewById(2131822670));
      this.zhC.setFromVoice(false);
      this.zhC.setFromGroup(paramBoolean2);
      this.zci = ((ImageView)paramView.findViewById(2131822661));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.an.c
 * JD-Core Version:    0.6.2
 */