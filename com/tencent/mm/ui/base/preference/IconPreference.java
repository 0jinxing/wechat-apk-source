package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IconPreference extends Preference
{
  private Context context;
  private String desc;
  public Drawable drawable;
  private int height;
  private TextView hrg;
  private View mView;
  protected ImageView olR;
  private String pnJ;
  private String pnK;
  private int qle;
  private int qlf;
  private int yBD;
  private int yBE;
  private int yBF;
  private ImageView yBG;
  private ViewGroup yBH;
  private TextView yBI;
  RelativeLayout.LayoutParams yBK;
  private int yBL;
  private int yBM;
  private int yBN;
  private int yBO;
  private int yBP;
  private int yBQ;
  private View yBR;
  private View yBS;
  private TextView yBT;
  private TextView yBU;
  protected ImageView yBV;
  private boolean yBW;
  public boolean yBX;
  private int yBY;
  public boolean yBZ;
  protected int yeV;
  private Bitmap yhX;

  public IconPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public IconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107166);
    this.yeV = -1;
    this.olR = null;
    this.pnJ = "";
    this.qle = -1;
    this.qlf = 8;
    this.yBD = 8;
    this.yBL = 8;
    this.desc = "";
    this.pnK = "";
    this.yBM = -1;
    this.yBN = 8;
    this.yBO = -1;
    this.yhX = null;
    this.yBP = 8;
    this.yBE = 0;
    this.yBF = 8;
    this.yBQ = 8;
    this.yBG = null;
    this.yBH = null;
    this.yBR = null;
    this.yBS = null;
    this.height = -1;
    this.yBW = false;
    this.yBX = false;
    this.yBY = -1;
    this.yBZ = false;
    this.context = paramContext;
    setLayoutResource(2130970127);
    AppMethodBeat.o(107166);
  }

  public final void NL(int paramInt)
  {
    AppMethodBeat.i(107171);
    this.qlf = paramInt;
    if (this.yBU != null)
      this.yBU.setVisibility(paramInt);
    AppMethodBeat.o(107171);
  }

  public final void NM(int paramInt)
  {
    AppMethodBeat.i(107172);
    this.yBN = paramInt;
    if (this.yBT != null)
      this.yBT.setVisibility(paramInt);
    AppMethodBeat.o(107172);
  }

  public final void NN(int paramInt)
  {
    AppMethodBeat.i(107175);
    this.yBD = paramInt;
    if (this.yBG != null)
      this.yBG.setVisibility(paramInt);
    AppMethodBeat.o(107175);
  }

  public final void NO(int paramInt)
  {
    AppMethodBeat.i(107177);
    this.yeV = paramInt;
    this.yhX = null;
    if (this.olR != null)
      this.olR.setImageResource(paramInt);
    AppMethodBeat.o(107177);
  }

  public final void NP(int paramInt)
  {
    AppMethodBeat.i(107178);
    this.yBP = paramInt;
    if (this.olR != null)
      this.olR.setVisibility(this.yBP);
    AppMethodBeat.o(107178);
  }

  public final void NQ(int paramInt)
  {
    AppMethodBeat.i(107179);
    this.yBE = paramInt;
    if (this.yBH != null)
      this.yBH.setVisibility(this.yBE);
    AppMethodBeat.o(107179);
  }

  public final void NR(int paramInt)
  {
    AppMethodBeat.i(107180);
    this.yBF = paramInt;
    if (this.yBR != null)
      this.yBR.setVisibility(this.yBF);
    AppMethodBeat.o(107180);
  }

  public final void ap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(107176);
    this.yhX = paramBitmap;
    this.yeV = -1;
    if (this.olR != null)
      this.olR.setImageBitmap(paramBitmap);
    AppMethodBeat.o(107176);
  }

  public final void av(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107170);
    this.pnK = paramString;
    this.yBM = paramInt1;
    this.yBO = paramInt2;
    if (this.yBT != null)
    {
      this.yBT.setText(paramString);
      if (paramInt1 != -1)
        this.yBT.setBackgroundDrawable(this.context.getResources().getDrawable(paramInt1));
      if (paramInt2 != -1)
        this.yBT.setTextColor(paramInt2);
    }
    AppMethodBeat.o(107170);
  }

  public final void dAy()
  {
    AppMethodBeat.i(107173);
    this.yBL = 0;
    if (this.hrg != null)
      this.hrg.setVisibility(0);
    AppMethodBeat.o(107173);
  }

  public final ImageView dAz()
  {
    return this.olR;
  }

  public final void ey(String paramString, int paramInt)
  {
    this.pnJ = paramString;
    this.qle = paramInt;
  }

  public final void ez(String paramString, int paramInt)
  {
    AppMethodBeat.i(107168);
    av(paramString, paramInt, this.yBO);
    AppMethodBeat.o(107168);
  }

  public final void hm(int paramInt1, int paramInt2)
  {
    this.yBD = paramInt1;
    this.yBY = paramInt2;
  }

  public final void hn(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107181);
    this.yBK = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    this.yBK.addRule(13);
    if (this.olR == null)
      AppMethodBeat.o(107181);
    while (true)
    {
      return;
      this.olR.setLayoutParams(this.yBK);
      AppMethodBeat.o(107181);
    }
  }

  protected void onBindView(View paramView)
  {
    AppMethodBeat.i(107182);
    super.onBindView(paramView);
    this.yBV = ((ImageView)paramView.findViewById(2131822184));
    label80: Object localObject;
    if (this.yBV != null)
    {
      if (this.drawable != null)
      {
        this.yBV.setImageDrawable(this.drawable);
        this.yBV.setVisibility(0);
        if (this.yDb == 0)
          break label741;
        this.yBV.getDrawable().setColorFilter(this.yDb, PorterDuff.Mode.SRC_ATOP);
      }
    }
    else
    {
      localObject = (LinearLayout)paramView.findViewById(2131822347);
      ((LinearLayout)localObject).setMinimumHeight(paramView.getResources().getDimensionPixelSize(2131427784));
      if (this.height != -1)
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      this.yBU = ((TextView)paramView.findViewById(2131822348));
      if (this.yBU != null)
      {
        if (!this.yBX)
          break label764;
        this.yBU.setCompoundDrawablesWithIntrinsicBounds(2130840510, 0, 0, 0);
        this.yBU.setCompoundDrawablePadding((int)this.context.getResources().getDimension(2131427858));
        label183: this.yBU.setVisibility(this.qlf);
        this.yBU.setText(this.pnJ);
        if (this.qle != -1)
          this.yBU.setBackgroundDrawable(this.context.getResources().getDrawable(this.qle));
      }
      this.yBT = ((TextView)paramView.findViewById(2131822350));
      if (this.yBT != null)
      {
        this.yBT.setVisibility(this.yBN);
        this.yBT.setText(this.pnK);
        if (this.yBM != -1)
          this.yBT.setBackgroundDrawable(this.context.getResources().getDrawable(this.yBM));
        if (this.yBO != -1)
          this.yBT.setTextColor(this.yBO);
        if (!this.yBW)
          break label778;
        this.yBT.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130840510, 0);
        this.yBT.setCompoundDrawablePadding((int)this.context.getResources().getDimension(2131427858));
      }
      label366: this.yBG = ((ImageView)paramView.findViewById(2131822349));
      this.yBG.setVisibility(this.yBD);
      if (this.yBY != -1)
        this.yBG.setImageResource(this.yBY);
      this.olR = ((ImageView)paramView.findViewById(2131822352));
      this.yBH = ((ViewGroup)paramView.findViewById(2131822351));
      this.yBS = paramView.findViewById(2131822354);
      this.yBS.setVisibility(this.yBQ);
      this.yBR = paramView.findViewById(2131822353);
      this.yBR.setVisibility(this.yBF);
      if (this.yhX == null)
        break label792;
      this.olR.setImageBitmap(this.yhX);
      label500: this.olR.setVisibility(this.yBP);
      this.yBH.setVisibility(this.yBE);
      if (this.yBK != null)
        this.olR.setLayoutParams(this.yBK);
      this.yBI = ((TextView)paramView.findViewById(16908310));
      this.hrg = ((TextView)paramView.findViewById(2131821095));
      if (this.hrg != null)
      {
        this.hrg.setVisibility(this.yBL);
        this.hrg.setText(this.desc);
        if (!this.yBZ)
          break label814;
        this.hrg.setTextColor(this.context.getResources().getColor(2131689960));
      }
      label624: if (this.yBI != null)
      {
        if (!this.yBZ)
          break label837;
        this.yBI.setTextColor(this.context.getResources().getColor(2131689960));
      }
      label658: if (this.yBZ)
        break label860;
    }
    label778: label792: label814: label837: label860: for (boolean bool = true; ; bool = false)
    {
      paramView.setEnabled(bool);
      AppMethodBeat.o(107182);
      return;
      if (this.ZV != 0)
      {
        localObject = this.yBV;
        Drawable localDrawable = this.mContext.getResources().getDrawable(this.ZV);
        this.drawable = localDrawable;
        ((ImageView)localObject).setImageDrawable(localDrawable);
        this.yBV.setVisibility(0);
        break;
      }
      this.yBV.setVisibility(8);
      break;
      label741: if (this.yBV.getDrawable() == null)
        break label80;
      this.yBV.getDrawable().clearColorFilter();
      break label80;
      label764: this.yBU.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label183;
      this.yBT.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label366;
      if (this.yeV == -1)
        break label500;
      this.olR.setImageResource(this.yeV);
      break label500;
      this.hrg.setTextColor(this.context.getResources().getColor(2131690164));
      break label624;
      this.yBI.setTextColor(this.context.getResources().getColor(2131690316));
      break label658;
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107167);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970151, localViewGroup);
    this.mView = paramViewGroup;
    paramViewGroup = this.mView;
    AppMethodBeat.o(107167);
    return paramViewGroup;
  }

  public final void qh(boolean paramBoolean)
  {
    AppMethodBeat.i(107174);
    this.yBW = paramBoolean;
    if (this.yBT != null)
      if (paramBoolean)
      {
        this.yBT.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130840510, 0);
        this.yBT.setCompoundDrawablePadding((int)this.context.getResources().getDimension(2131427858));
        AppMethodBeat.o(107174);
      }
    while (true)
    {
      return;
      this.yBT.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      AppMethodBeat.o(107174);
    }
  }

  public final void setDesc(String paramString)
  {
    AppMethodBeat.i(107169);
    this.desc = paramString;
    if (this.hrg != null)
      this.hrg.setText(paramString);
    AppMethodBeat.o(107169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.IconPreference
 * JD-Core Version:    0.6.2
 */