package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.r;

public class AccountInfoPreference extends Preference
{
  private boolean pls;
  public String userName;
  public SpannableString vpW;
  public String vpX;
  private RelativeLayout vpY;
  private View vpZ;
  private boolean vqa;
  private int vqb;
  private NoMeasuredTextView vqc;
  public View.OnClickListener vqd;
  public View.OnClickListener vqe;
  private View.OnClickListener vqf;
  private View.OnClickListener vqg;

  public AccountInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AccountInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(28016);
    this.pls = false;
    this.vqa = true;
    this.vqc = null;
    this.vqd = null;
    this.vqe = null;
    this.vqf = null;
    this.vqg = new AccountInfoPreference.1(this);
    AppMethodBeat.o(28016);
  }

  public final void ad(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(28018);
    ab.d("TEST", "updateAccountStoryStatus %s", new Object[] { Boolean.valueOf(paramBoolean1) });
    this.pls = paramBoolean1;
    this.vqa = paramBoolean2;
    LinearLayout.LayoutParams localLayoutParams;
    if (this.vqc != null)
    {
      if (paramBoolean1)
      {
        this.vqc.setTextColor(a.h(this.mContext, 2131690693));
        localLayoutParams = (LinearLayout.LayoutParams)this.vpY.getLayoutParams();
        localLayoutParams.gravity = 8388693;
        this.vpY.setLayoutParams(localLayoutParams);
        this.vpY.setGravity(16);
      }
    }
    else if (this.vpZ != null)
      if ((paramBoolean1) || (!paramBoolean2))
        break label211;
    label211: for (int i = a.am(this.mContext, 2131428604); ; i = a.am(this.mContext, 2131428603))
    {
      this.vpZ.setPadding(this.vpZ.getPaddingLeft(), i, this.vpZ.getPaddingRight(), this.vpZ.getPaddingBottom());
      AppMethodBeat.o(28018);
      return;
      this.vqc.setTextColor(a.h(this.mContext, 2131690316));
      localLayoutParams = (LinearLayout.LayoutParams)this.vpY.getLayoutParams();
      localLayoutParams.gravity = 8388693;
      this.vpY.setGravity(16);
      this.vpY.setLayoutParams(localLayoutParams);
      break;
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28017);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(2131821183);
    if ((this.userName != null) && (localObject != null) && (g.RK()))
      a.b.b((ImageView)localObject, this.userName);
    ((ImageView)localObject).setOnClickListener(this.vqg);
    this.vqc = ((NoMeasuredTextView)paramView.findViewById(2131821809));
    if ((this.userName != null) && (this.vqc != null))
    {
      this.vqc.setShouldEllipsize(true);
      this.vqc.setTextSize(0, a.al(this.mContext, 2131427763));
      if (!this.pls)
        break label404;
      this.vqc.setTextColor(a.h(this.mContext, 2131690693));
      NoMeasuredTextView localNoMeasuredTextView = this.vqc;
      if (this.vpW != null)
        break label423;
      localObject = this.userName;
      label147: localNoMeasuredTextView.setText((CharSequence)localObject);
      if (this.vqc.getPaint() != null)
        this.vqc.getPaint().setFakeBoldText(true);
    }
    localObject = (TextView)paramView.findViewById(2131826146);
    if ((this.vpX != null) && (localObject != null))
    {
      ((TextView)localObject).setText(paramView.getResources().getString(2131296520, new Object[] { this.vpX }));
      label218: ((TextView)localObject).setOnClickListener(this.vqg);
      localObject = (TextView)paramView.findViewById(2131822353);
      if (localObject != null)
      {
        if (this.vqb <= 99)
          break label444;
        ((TextView)localObject).setText(this.mContext.getString(2131303989));
        ((TextView)localObject).setBackgroundResource(r.ik(this.mContext));
        ((TextView)localObject).setVisibility(0);
      }
      label278: this.vpY = ((RelativeLayout)paramView.findViewById(2131826149));
      this.vpY.setOnClickListener(this.vqg);
      this.vpZ = paramView.findViewById(2131823007);
      if (this.vpZ != null)
        if ((this.pls) || (!this.vqa))
          break label489;
    }
    label404: label423: label444: label489: for (int i = a.am(this.mContext, 2131428604); ; i = a.am(this.mContext, 2131428603))
    {
      this.vpZ.setPadding(this.vpZ.getPaddingLeft(), i, this.vpZ.getPaddingRight(), this.vpZ.getPaddingBottom());
      this.vpZ.setOnClickListener(this.vqe);
      ad(this.pls, this.vqa);
      AppMethodBeat.o(28017);
      return;
      this.vqc.setTextColor(a.h(this.mContext, 2131690316));
      break;
      localObject = this.vpW;
      break label147;
      if (localObject == null)
        break label218;
      ((TextView)localObject).setVisibility(8);
      break label218;
      if (this.vqb > 0)
      {
        ((TextView)localObject).setText(this.vqb);
        ((TextView)localObject).setVisibility(0);
        break label278;
      }
      ((TextView)localObject).setVisibility(8);
      break label278;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference
 * JD-Core Version:    0.6.2
 */