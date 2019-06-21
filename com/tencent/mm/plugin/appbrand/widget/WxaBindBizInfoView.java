package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;
import java.util.List;

public class WxaBindBizInfoView extends LinearLayout
{
  private static int iUs;
  private static int iUt;
  private TextView iDT;
  private List<WxaAttributes.WxaEntryInfo> iUl;
  private View iUm;
  private ImageView iUn;
  private TextView iUo;
  private LinearLayout iUp;
  private ViewGroup iUq;
  private View iUr;

  static
  {
    AppMethodBeat.i(133657);
    iUs = a.fromDPToPix(ah.getContext(), 15);
    iUt = a.fromDPToPix(ah.getContext(), 30);
    AppMethodBeat.o(133657);
  }

  public WxaBindBizInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(133655);
    init();
    AppMethodBeat.o(133655);
  }

  public WxaBindBizInfoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(133654);
    init();
    AppMethodBeat.o(133654);
  }

  private void init()
  {
    AppMethodBeat.i(133656);
    this.iUl = new LinkedList();
    View localView = View.inflate(getContext(), 2130968710, this);
    this.iUm = localView.findViewById(2131821312);
    this.iUn = ((ImageView)localView.findViewById(2131821313));
    this.iDT = ((TextView)localView.findViewById(2131821314));
    this.iUo = ((TextView)localView.findViewById(2131821317));
    this.iUr = localView.findViewById(2131821316);
    this.iUp = ((LinearLayout)localView.findViewById(2131821315));
    this.iUq = ((ViewGroup)localView.findViewById(2131821311));
    AppMethodBeat.o(133656);
  }

  public List<WxaAttributes.WxaEntryInfo> getWxaEntryInfoList()
  {
    return this.iUl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.WxaBindBizInfoView
 * JD-Core Version:    0.6.2
 */