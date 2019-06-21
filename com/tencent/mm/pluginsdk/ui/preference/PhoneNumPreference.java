package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class PhoneNumPreference extends Preference
{
  public f iFE;
  public ad ldh;
  private View omq;
  public String vim;
  public String vin;
  ProfileMobilePhoneView vrm;

  public PhoneNumPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public PhoneNumPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void dlc()
  {
    AppMethodBeat.i(28112);
    if ((this.ldh == null) || (!a.jh(this.ldh.field_type)) || (ad.aox(this.ldh.field_username)) || ((bo.isNullOrNil(this.vim)) && (bo.isNullOrNil(this.vin))))
    {
      this.iFE.ce("contact_profile_phone", true);
      AppMethodBeat.o(28112);
    }
    while (true)
    {
      return;
      this.iFE.ce("contact_profile_phone", false);
      AppMethodBeat.o(28112);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28111);
    super.onBindView(paramView);
    this.vrm.cby();
    AppMethodBeat.o(28111);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28110);
    if (this.omq == null)
    {
      View localView = super.onCreateView(paramViewGroup);
      ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
      localViewGroup.removeAllViews();
      paramViewGroup = new ProfileMobilePhoneView(localView.getContext());
      this.vrm = paramViewGroup;
      localViewGroup.addView(paramViewGroup, new AbsListView.LayoutParams(-1, -2));
      this.vrm.hG(this.vim, this.vin);
      this.omq = localView;
    }
    paramViewGroup = this.omq;
    AppMethodBeat.o(28110);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.PhoneNumPreference
 * JD-Core Version:    0.6.2
 */