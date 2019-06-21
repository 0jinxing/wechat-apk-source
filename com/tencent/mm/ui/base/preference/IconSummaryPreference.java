package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;

public class IconSummaryPreference extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height;
  private ImageView olR;
  private String pnJ;
  private int qle;
  public int qlf;
  private int yBE;
  private int yBF;
  private ViewGroup yBH;
  RelativeLayout.LayoutParams yBK;
  private int yBP;
  private View yBR;
  private int yCa;
  private TextView yCb;
  private int yCc;
  private int yeV;
  private Bitmap yhX;

  public IconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107183);
    this.pnJ = "";
    this.qle = -1;
    this.qlf = 8;
    this.yhX = null;
    this.yeV = -1;
    this.yBP = 8;
    this.yBE = 0;
    this.yBF = 8;
    this.yCa = 8;
    this.olR = null;
    this.yBH = null;
    this.yBR = null;
    this.yCb = null;
    this.yCc = -1;
    this.height = -1;
    this.context = paramContext;
    setLayoutResource(2130970127);
    AppMethodBeat.o(107183);
  }

  public final void aqR(String paramString)
  {
    this.pnJ = paramString;
    this.qle = 2130839673;
  }

  public final void dAA()
  {
    AppMethodBeat.i(107187);
    this.yCa = 0;
    if (this.yCb != null)
      this.yCb.setVisibility(this.yCa);
    AppMethodBeat.o(107187);
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107188);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(2131822184);
    if (localObject != null)
    {
      ((ImageView)localObject).setVisibility(8);
      if (this.drawable != null)
      {
        ((ImageView)localObject).setImageDrawable(this.drawable);
        ((ImageView)localObject).setVisibility(0);
      }
    }
    else
    {
      localObject = (LinearLayout)paramView.findViewById(2131822347);
      if (this.height != -1)
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      localObject = (TextView)paramView.findViewById(2131822348);
      if (localObject != null)
      {
        ((TextView)localObject).setVisibility(this.qlf);
        ((TextView)localObject).setText(this.pnJ);
        if (this.qle != -1)
          ((TextView)localObject).setBackgroundDrawable(a.g(this.context, this.qle));
      }
      if (this.olR == null)
        this.olR = ((ImageView)paramView.findViewById(2131822352));
      if (this.yBH == null)
        this.yBH = ((ViewGroup)paramView.findViewById(2131822351));
      if (this.yBR == null)
        this.yBR = paramView.findViewById(2131822353);
      this.yBR.setVisibility(this.yBF);
      if (this.yhX == null)
        break label425;
      this.olR.setImageBitmap(this.yhX);
    }
    while (true)
    {
      this.olR.setVisibility(this.yBP);
      this.yBH.setVisibility(this.yBE);
      if (this.yBK != null)
        this.olR.setLayoutParams(this.yBK);
      this.yCb = ((TextView)paramView.findViewById(2131826039));
      if ((this.yCb != null) && (getSummary() != null) && (getSummary().length() > 0))
      {
        this.yCb.setText(getSummary());
        this.yCb.setVisibility(this.yCa);
      }
      if ((this.yCb != null) && (this.yCc != -1))
      {
        this.yCb.setCompoundDrawablesWithIntrinsicBounds(this.yCc, 0, 0, 0);
        int i = BackwardSupportUtil.b.b(this.mContext, 2.0F);
        this.yCb.setCompoundDrawablePadding(i);
        this.yCb.setVisibility(this.yCa);
      }
      AppMethodBeat.o(107188);
      return;
      if (this.rP != null)
      {
        ((ImageView)localObject).setImageDrawable(this.rP);
        ((ImageView)localObject).setVisibility(0);
        break;
      }
      if (this.ZV == 0)
        break;
      ((ImageView)localObject).setImageResource(this.ZV);
      ((ImageView)localObject).setVisibility(0);
      break;
      label425: if (this.yeV != -1)
        this.olR.setImageResource(this.yeV);
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107184);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970152, paramViewGroup);
    AppMethodBeat.o(107184);
    return localView;
  }

  public final void setSummary(int paramInt)
  {
    AppMethodBeat.i(107186);
    super.setSummary(paramInt);
    if ((this.yCb != null) && (getSummary() != null) && (getSummary().length() > 0))
      this.yCb.setText(getSummary());
    AppMethodBeat.o(107186);
  }

  public final void setSummary(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107185);
    super.setSummary(paramCharSequence);
    if ((this.yCb != null) && (getSummary() != null) && (getSummary().length() > 0))
      this.yCb.setText(getSummary());
    AppMethodBeat.o(107185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.IconSummaryPreference
 * JD-Core Version:    0.6.2
 */