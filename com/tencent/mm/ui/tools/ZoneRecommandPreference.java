package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.base.preference.Preference;

public class ZoneRecommandPreference extends Preference
{
  private TextView gnh;
  int status;
  RegionCodeDecoder.Region zIl;
  RegionCodeDecoder.Region zIm;
  RegionCodeDecoder.Region zIn;
  private TextView zIo;
  private ImageView zIp;

  public ZoneRecommandPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public ZoneRecommandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ZoneRecommandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(35014);
    this.status = 0;
    setLayoutResource(2130970127);
    AppMethodBeat.o(35014);
  }

  final void dKb()
  {
    AppMethodBeat.i(35017);
    if ((this.zIo == null) || (this.gnh == null))
    {
      AppMethodBeat.o(35017);
      return;
    }
    switch (this.status)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(35017);
      break;
      this.zIo.setVisibility(8);
      this.gnh.setVisibility(0);
      this.gnh.setText(2131303014);
      this.zIp.setImageResource(2131231364);
      setEnabled(false);
      setSelectable(false);
      AppMethodBeat.o(35017);
      break;
      this.zIo.setVisibility(8);
      this.gnh.setVisibility(0);
      this.gnh.setText(2131303011);
      this.zIp.setImageResource(2131231363);
      setEnabled(false);
      setSelectable(false);
      AppMethodBeat.o(35017);
      break;
      this.zIo.setVisibility(0);
      this.gnh.setVisibility(8);
      this.zIp.setImageResource(2131231364);
      Object localObject1 = "";
      Object localObject2 = localObject1;
      if (this.zIl != null)
      {
        localObject2 = localObject1;
        if (!ah.isNullOrNil(this.zIl.getName()))
          localObject2 = "" + this.zIl.getName();
      }
      localObject1 = localObject2;
      if (this.zIm != null)
      {
        localObject1 = localObject2;
        if (!ah.isNullOrNil(this.zIm.getName()))
          localObject1 = (String)localObject2 + " " + this.zIm.getName();
      }
      localObject2 = localObject1;
      if (this.zIn != null)
      {
        localObject2 = localObject1;
        if (!ah.isNullOrNil(this.zIn.getName()))
          localObject2 = (String)localObject1 + " " + this.zIn.getName();
      }
      this.zIo.setText((CharSequence)localObject2);
      setEnabled(true);
      setSelectable(true);
    }
  }

  public final void dKc()
  {
    AppMethodBeat.i(35018);
    this.status = 2;
    dKb();
    AppMethodBeat.o(35018);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(35016);
    super.onBindView(paramView);
    dKb();
    AppMethodBeat.o(35016);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(35015);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
    localViewGroup.removeAllViews();
    paramViewGroup.inflate(2130970171, localViewGroup);
    this.zIo = ((TextView)localView.findViewById(2131826048));
    this.gnh = ((TextView)localView.findViewById(2131826053));
    this.zIp = ((ImageView)localView.findViewById(2131826052));
    AppMethodBeat.o(35015);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ZoneRecommandPreference
 * JD-Core Version:    0.6.2
 */