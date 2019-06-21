package com.tencent.weui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
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
  private Drawable drawable;
  private int height;
  private TextView hrg;
  protected ImageView olR;
  private String pnJ;
  private String pnK;
  private ImageView qZa;
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
  private ImageView yBV;
  private boolean yBW;
  private boolean yBX;
  private int yBY;
  private boolean yBZ;
  private int yDi;
  protected int yeV;
  private Bitmap yhX;

  public IconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113253);
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
    this.yBE = 8;
    this.yBF = 8;
    this.yBQ = 8;
    this.yDi = 0;
    this.yBG = null;
    this.yBH = null;
    this.yBR = null;
    this.yBS = null;
    this.qZa = null;
    this.height = -1;
    this.yBW = false;
    this.yBX = false;
    this.yBY = -1;
    this.yBZ = false;
    this.context = paramContext;
    setLayoutResource(2130970127);
    AppMethodBeat.o(113253);
  }

  protected void onBindView(View paramView)
  {
    AppMethodBeat.i(113255);
    super.onBindView(paramView);
    this.yBV = ((ImageView)paramView.findViewById(2131822184));
    Object localObject;
    if (this.yBV != null)
    {
      if (this.drawable != null)
      {
        this.yBV.setImageDrawable(this.drawable);
        this.yBV.setVisibility(0);
      }
    }
    else
    {
      localObject = (LinearLayout)paramView.findViewById(2131822347);
      ((LinearLayout)localObject).setMinimumHeight(paramView.getResources().getDimensionPixelSize(2131427857));
      if (this.height != -1)
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      this.yBU = ((TextView)paramView.findViewById(2131822348));
      if (this.yBU != null)
      {
        if (!this.yBX)
          break label714;
        this.yBU.setCompoundDrawablesWithIntrinsicBounds(2130840510, 0, 0, 0);
        this.yBU.setCompoundDrawablePadding((int)this.context.getResources().getDimension(2131427858));
        label154: this.yBU.setVisibility(this.qlf);
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
          break label728;
        this.yBT.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130840510, 0);
        this.yBT.setCompoundDrawablePadding((int)this.context.getResources().getDimension(2131427858));
      }
      label334: this.yBG = ((ImageView)paramView.findViewById(2131822349));
      this.yBG.setVisibility(this.yBD);
      if (this.yBY != -1)
        this.yBG.setImageResource(this.yBY);
      this.olR = ((ImageView)paramView.findViewById(2131822352));
      this.yBH = ((ViewGroup)paramView.findViewById(2131822351));
      this.yBS = paramView.findViewById(2131822354);
      this.yBS.setVisibility(this.yBQ);
      this.yBR = paramView.findViewById(2131822353);
      this.yBR.setVisibility(this.yBF);
      this.qZa = ((ImageView)paramView.findViewById(2131821517));
      this.qZa.setVisibility(this.yDi);
      if (this.yhX == null)
        break label742;
      this.olR.setImageBitmap(this.yhX);
      label487: this.olR.setVisibility(this.yBP);
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
          break label764;
        this.hrg.setTextColor(this.context.getResources().getColor(2131689960));
      }
      label608: if (this.yBI != null)
      {
        if (!this.yBZ)
          break label786;
        this.yBI.setTextColor(this.context.getResources().getColor(2131689960));
      }
      label641: if (this.yBZ)
        break label809;
    }
    label786: label809: for (boolean bool = true; ; bool = false)
    {
      paramView.setEnabled(bool);
      AppMethodBeat.o(113255);
      return;
      if (getIcon() != null)
      {
        localObject = this.yBV;
        Drawable localDrawable = getIcon();
        this.drawable = localDrawable;
        ((ImageView)localObject).setImageDrawable(localDrawable);
        this.yBV.setVisibility(0);
        break;
      }
      this.yBV.setVisibility(8);
      break;
      label714: this.yBU.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label154;
      label728: this.yBT.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label334;
      label742: if (this.yeV == -1)
        break label487;
      this.olR.setImageResource(this.yeV);
      break label487;
      label764: this.hrg.setTextColor(this.context.getResources().getColor(2131690164));
      break label608;
      this.yBI.setTextColor(this.context.getResources().getColor(2131690316));
      break label641;
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(113254);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), 2130970374, localViewGroup);
    AppMethodBeat.o(113254);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.IconPreference
 * JD-Core Version:    0.6.2
 */