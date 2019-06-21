package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.chatting.viewitems.ay;

public final class q$b
  implements View.OnClickListener, View.OnTouchListener, ai.b
{
  private View WL;
  private View auE;
  private ap gyS;
  private int hz;
  private int iJp;
  private int pnS;
  private int yJA;
  private int yJB;
  private boolean yJC;
  private q.a yJD;
  private View.OnTouchListener yJE;
  private int yJF;
  private ap.a yJG;
  private o yJw;
  private View yJx;
  private View yJy;
  private int yJz;

  public q$b()
  {
    AppMethodBeat.i(30698);
    this.yJD = new q.a();
    this.yJE = new q.b.1(this);
    this.yJF = 300;
    this.yJG = new q.b.2(this);
    AppMethodBeat.o(30698);
  }

  private void dismiss()
  {
    AppMethodBeat.i(30699);
    if (this.yJw != null)
      this.yJw.dismiss();
    AppMethodBeat.o(30699);
  }

  public final boolean f(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30700);
    Object localObject1 = paramView.getTag();
    boolean bool;
    if ((localObject1 == null) || (!(localObject1 instanceof ay)))
    {
      ab.i("MicroMsg.ChattingItemAvatarOnHoverHelper", "The Tag of the View is not a instance of ItemDataTag or is null.");
      AppMethodBeat.o(30700);
      bool = false;
      return bool;
    }
    localObject1 = (ay)paramView.getTag();
    Object localObject2 = ((ay)localObject1).userName;
    Object localObject3 = r.Yz();
    if ((ah.isNullOrNil((String)localObject3)) || (((String)localObject3).equals(localObject2)))
      ab.v("MicroMsg.ChattingItemAvatarOnHoverHelper", "Can't talk to self and self username can't be null.");
    for (int i = 0; ; i = 1)
    {
      if (i != 0)
        break label111;
      AppMethodBeat.o(30700);
      bool = false;
      break;
    }
    label111: localObject2 = paramView.getContext();
    if (this.yJw == null)
    {
      localObject3 = ((Context)localObject2).getResources();
      float f = ((Resources)localObject3).getDimension(2131427801);
      this.yJz = ((int)(((Resources)localObject3).getDimension(2131427500) * 2.0F + f));
      this.WL = View.inflate((Context)localObject2, 2130969028, null);
      this.yJx = this.WL.findViewById(2131822449);
      this.yJy = this.WL.findViewById(2131822450);
      this.yJy.setOnClickListener(this);
      this.yJx.setOnClickListener(this);
      this.yJy.setOnTouchListener(this.yJE);
      this.yJx.setOnTouchListener(this.yJE);
      this.yJw = new o(this.WL, -2, this.yJz, false);
      this.yJw.setOutsideTouchable(true);
      localObject3 = new Rect();
      if ((localObject2 instanceof Activity))
        ((Activity)localObject2).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject3);
      this.iJp = ((Rect)localObject3).top;
      localObject3 = ((Context)localObject2).getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject3).widthPixels > ((DisplayMetrics)localObject3).heightPixels)
      {
        this.pnS = ((Context)localObject2).getResources().getDimensionPixelSize(2131427562);
        label342: this.yJw.setBackgroundDrawable(new ColorDrawable(16777215));
        this.hz = 0;
        this.gyS = new ap(Looper.getMainLooper(), this.yJG, false);
        ab.i("MicroMsg.ChattingItemAvatarOnHoverHelper", "Create a new PopupWindow.");
      }
    }
    else
    {
      localObject2 = this.yJw;
      switch (paramMotionEvent.getAction())
      {
      default:
      case 10:
      case 9:
      }
    }
    do
    {
      while (true)
      {
        AppMethodBeat.o(30700);
        bool = true;
        break;
        this.pnS = ((Context)localObject2).getResources().getDimensionPixelSize(2131427563);
        break label342;
        this.yJC = false;
        this.auE = null;
      }
      this.auE = paramView;
      paramView.setOnTouchListener(this);
      if (((o)localObject2).isShowing())
        ((o)localObject2).dismiss();
    }
    while (this.yJC);
    this.yJy.setTag(localObject1);
    this.yJx.setTag(localObject1);
    this.yJy.setVisibility(0);
    this.yJx.setVisibility(8);
    paramMotionEvent = new int[2];
    paramView.getLocationInWindow(paramMotionEvent);
    i = paramMotionEvent[1];
    paramView.getWidth();
    int j = paramView.getHeight();
    this.yJB = this.hz;
    if (i > this.iJp + this.pnS + this.yJz)
      this.yJB = (-j - this.yJz - this.hz);
    this.yJA = 0;
    if (this.yJB >= 0)
      this.WL.setBackgroundResource(2130838260);
    while (true)
    {
      paramView = this.gyS;
      long l = this.yJF;
      paramView.ae(l, l);
      break;
      this.WL.setBackgroundResource(2130838261);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30702);
    ay localay = (ay)paramView.getTag();
    if (paramView == this.yJy)
      q.w(paramView.getContext(), localay.userName, 3);
    while (true)
    {
      dismiss();
      AppMethodBeat.o(30702);
      return;
      q.w(paramView.getContext(), localay.userName, 2);
    }
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30701);
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(30701);
      return false;
      this.yJC = true;
      dismiss();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.q.b
 * JD-Core Version:    0.6.2
 */