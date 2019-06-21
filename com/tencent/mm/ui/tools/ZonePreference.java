package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.base.preference.Preference;

public class ZonePreference extends Preference
{
  RegionCodeDecoder.Region zIi;
  private CharSequence zIj;
  private TextView zIk;

  public ZonePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public ZonePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ZonePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(35008);
    setLayoutResource(2130970127);
    AppMethodBeat.o(35008);
  }

  private void dKa()
  {
    AppMethodBeat.i(35011);
    if (this.zIk == null)
    {
      AppMethodBeat.o(35011);
      return;
    }
    if ((this.zIj != null) && (!ah.isNullOrNil(this.zIj.toString())))
      this.zIk.setVisibility(0);
    while (true)
    {
      this.zIk.setText(this.zIj);
      AppMethodBeat.o(35011);
      break;
      this.zIk.setVisibility(8);
    }
  }

  public final void a(RegionCodeDecoder.Region paramRegion)
  {
    AppMethodBeat.i(35009);
    if ((paramRegion == null) || (ah.isNullOrNil(paramRegion.getName())) || (ah.isNullOrNil(paramRegion.getCode())))
    {
      ab.e("MicroMsg.ZonePreference", "setZoneItem item = null");
      AppMethodBeat.o(35009);
    }
    while (true)
    {
      return;
      setKey(paramRegion.getCode() + paramRegion.isCity());
      this.zIi = paramRegion;
      AppMethodBeat.o(35009);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(35013);
    super.onBindView(paramView);
    if (this.zIi == null)
      AppMethodBeat.o(35013);
    while (true)
    {
      return;
      ((TextView)paramView.findViewById(2131826048)).setText(this.zIi.getName());
      this.zIk = ((TextView)paramView.findViewById(2131826051));
      dKa();
      AppMethodBeat.o(35013);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(35012);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130970170, localViewGroup);
    AppMethodBeat.o(35012);
    return paramViewGroup;
  }

  public final void setSummary(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(35010);
    this.zIj = paramCharSequence;
    dKa();
    AppMethodBeat.o(35010);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ZonePreference
 * JD-Core Version:    0.6.2
 */