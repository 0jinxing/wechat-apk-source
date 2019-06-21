package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.wenote.model.a.c;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class i extends a
{
  public static float uUN = Resources.getSystem().getDisplayMetrics().density;
  public static int uUO = Resources.getSystem().getDisplayMetrics().widthPixels;
  public static int uUP = (int)(40.0F * uUN + 0.5F);
  public ImageView cAw;
  public LinearLayout gCe;
  public View.OnClickListener nij = new i.4(this);
  public WXRTEditText uUA;
  public LinearLayout uUB;
  public TextView uUC;
  public TextView uUD;
  public ImageView uUE;
  public View uUF;
  public LinearLayout uUG;
  public LinearLayout uUH;
  public LinearLayout uUI;
  public LinearLayout uUJ;
  public LinearLayout uUK;
  public LinearLayout uUL;
  public LinearLayout uUM;
  public WXRTEditText uUz;

  public i(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.cAw = ((ImageView)paramView.findViewById(2131826385));
    this.uUF = paramView.findViewById(2131826386);
    this.uUB = ((LinearLayout)paramView.findViewById(2131826387));
    this.gCe = ((LinearLayout)paramView.findViewById(2131826391));
    this.uUC = ((TextView)paramView.findViewById(2131826389));
    this.uUD = ((TextView)paramView.findViewById(2131826390));
    this.uUE = ((ImageView)paramView.findViewById(2131826388));
    this.uUC.setTextSize(16.0F);
    this.uUD.setTextSize(12.0F);
    this.uUG = ((LinearLayout)paramView.findViewById(2131826400));
    this.uUG.setVisibility(8);
    this.uUI = ((LinearLayout)paramView.findViewById(2131826405));
    this.uUI.setVisibility(8);
    this.uUJ = ((LinearLayout)paramView.findViewById(2131826402));
    this.uUJ.setVisibility(8);
    this.uUK = ((LinearLayout)paramView.findViewById(2131826408));
    this.uUK.setBackgroundColor(1347529272);
    this.uUK.setVisibility(8);
    this.uUK.setOnClickListener(new i.1(this));
    this.uUL = ((LinearLayout)paramView.findViewById(2131826377));
    this.uUL.setBackgroundColor(1347529272);
    this.uUL.setVisibility(4);
    this.uUM = ((LinearLayout)paramView.findViewById(2131826409));
    this.uUM.setBackgroundColor(1347529272);
    this.uUM.setVisibility(4);
    this.uUH = ((LinearLayout)paramView.findViewById(2131826376));
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.uUH.getLayoutParams();
    localLayoutParams.width = (uUO - uUP);
    localLayoutParams.height = -2;
    this.uUH.setLayoutParams(localLayoutParams);
    this.uUA = ((WXRTEditText)paramView.findViewById(2131826413));
    this.uUz = ((WXRTEditText)paramView.findViewById(2131826411));
    ((LinearLayout)paramView.findViewById(2131826412)).setOnClickListener(new i.2(this));
    ((LinearLayout)paramView.findViewById(2131826410)).setOnClickListener(new i.3(this));
    this.uUA.setEditTextType(2);
    this.uUz.setEditTextType(1);
    this.uUz.uPS = this;
    this.uUA.uPS = this;
    if ((paramk.uQI != 2) || (!this.uSJ.uQJ))
    {
      this.uUA.setKeyListener(null);
      this.uUA.setEnabled(false);
      this.uUA.setFocusable(false);
      this.uUz.setKeyListener(null);
      this.uUz.setEnabled(false);
      this.uUz.setFocusable(false);
    }
    this.uSJ.q(this.uUz);
    this.uSJ.q(this.uUA);
  }

  public void a(c paramc, int paramInt1, int paramInt2)
  {
    ab.i("Micromsg.NoteOtherItemHolder", "ImageItemHolder position is " + ki());
    this.uUz.setPosInDataList(paramInt1);
    this.uUA.setPosInDataList(paramInt1);
    if (e.isEnabled())
      e.dfb().a(this.uUK, this.uUL, this.uUM, paramInt1);
    paramc.uNW = this.uUz;
    paramc.uNX = this.uUA;
    paramc.uNY = null;
    if (paramc.uNT)
      if (paramc.uNZ)
      {
        this.uUz.requestFocus();
        if (this.uUB.getVisibility() == 0)
        {
          if (!paramc.uOa)
            break label184;
          this.uUB.setBackgroundResource(2130840796);
        }
      }
    while (true)
    {
      return;
      this.uUA.requestFocus();
      break;
      if (this.uUz.hasFocus())
        this.uUz.clearFocus();
      if (!this.uUA.hasFocus())
        break;
      this.uUA.clearFocus();
      break;
      label184: this.uUB.setBackgroundResource(2130840795);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.i
 * JD-Core Version:    0.6.2
 */