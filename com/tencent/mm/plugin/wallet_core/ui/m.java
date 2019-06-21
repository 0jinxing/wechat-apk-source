package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public final class m
{
  public static Dialog a(Context paramContext, ECardInfo paramECardInfo, int paramInt)
  {
    AppMethodBeat.i(47402);
    View localView = LayoutInflater.from(paramContext).inflate(2130971111, null);
    ImageView localImageView = (ImageView)localView.findViewById(2131822694);
    int i = BackwardSupportUtil.b.b(paramContext, 50.0F);
    bo.n(localImageView, i, i, i, i);
    TextView localTextView1 = (TextView)localView.findViewById(2131828601);
    Object localObject1 = (TextView)localView.findViewById(2131828602);
    Button localButton = (Button)localView.findViewById(2131828813);
    Object localObject2 = (TextView)localView.findViewById(2131828814);
    Object localObject3 = (CheckBox)localView.findViewById(2131820932);
    TextView localTextView2 = (TextView)localView.findViewById(2131828817);
    localTextView1.setText(paramECardInfo.title);
    if (!bo.isNullOrNil(paramECardInfo.subtitle))
    {
      ((TextView)localObject1).setText(paramECardInfo.subtitle);
      ((TextView)localObject1).setVisibility(0);
      i = paramECardInfo.tys.length();
      int j = (paramECardInfo.tys + paramECardInfo.tyt).length();
      localObject1 = new SpannableString(paramECardInfo.tys + paramECardInfo.tyt);
      ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(paramContext.getResources().getColor(2131690645)), i, j, 33);
      if (bo.ac((CharSequence)localObject1))
        break label526;
      ((TextView)localObject2).setText((CharSequence)localObject1);
      ((TextView)localObject2).setOnClickListener(new m.6(paramECardInfo, paramContext, paramInt));
      label276: localObject2 = new Dialog(paramContext, 2131493867);
      ((Dialog)localObject2).setContentView(localView);
      ((Dialog)localObject2).setTitle(null);
      ((Dialog)localObject2).setOnCancelListener(new m.7((Dialog)localObject2));
      localImageView.setOnClickListener(new m.8((Dialog)localObject2));
      localButton.setOnClickListener(new m.9(paramECardInfo, paramContext, (Dialog)localObject2));
      if (paramECardInfo.tyj != 1)
        break label557;
      ((CheckBox)localObject3).setOnCheckedChangeListener(new m.10(localButton));
      if (paramECardInfo.tyk != 1)
        break label536;
      ((CheckBox)localObject3).setChecked(true);
    }
    while (true)
    {
      paramInt = paramECardInfo.tyl.length();
      i = (paramECardInfo.tyl + paramECardInfo.tym).length();
      localObject3 = new SpannableString(paramECardInfo.tyl + paramECardInfo.tym);
      ((SpannableString)localObject3).setSpan(new ForegroundColorSpan(paramContext.getResources().getColor(2131690645)), paramInt, i, 33);
      localTextView2.setText((CharSequence)localObject3);
      localTextView2.setOnClickListener(new m.2(paramECardInfo, paramContext));
      ((Dialog)localObject2).show();
      h.a(paramContext, (Dialog)localObject2);
      AppMethodBeat.o(47402);
      return localObject2;
      ((TextView)localObject1).setVisibility(8);
      break;
      label526: ((TextView)localObject2).setVisibility(8);
      break label276;
      label536: ((CheckBox)localObject3).setChecked(false);
      localButton.setEnabled(false);
      localButton.setClickable(false);
      continue;
      label557: ((CheckBox)localObject3).setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.m
 * JD-Core Version:    0.6.2
 */