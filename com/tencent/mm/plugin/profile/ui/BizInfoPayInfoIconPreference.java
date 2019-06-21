package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.List;

public class BizInfoPayInfoIconPreference extends Preference
{
  private LayoutInflater mInflater;
  private LinearLayout pla;
  private List<String> plb;
  private int plc;

  public BizInfoPayInfoIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BizInfoPayInfoIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23316);
    this.plc = -1;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(2130970127);
    AppMethodBeat.o(23316);
  }

  private void AT(int paramInt)
  {
    AppMethodBeat.i(23322);
    ImageView localImageView = (ImageView)this.mInflater.inflate(2130969199, null);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a.fromDPToPix(this.mContext, 20), a.fromDPToPix(this.mContext, 20));
    localLayoutParams.rightMargin = a.fromDPToPix(this.mContext, 6);
    localImageView.setImageResource(paramInt);
    this.pla.addView(localImageView, localLayoutParams);
    AppMethodBeat.o(23322);
  }

  private void UN(String paramString)
  {
    AppMethodBeat.i(23323);
    CdnImageView localCdnImageView = new CdnImageView(this.mContext);
    localCdnImageView.setUrl(paramString);
    paramString = new LinearLayout.LayoutParams(a.fromDPToPix(this.mContext, 20), a.fromDPToPix(this.mContext, 20));
    paramString.rightMargin = a.fromDPToPix(this.mContext, 6);
    this.pla.addView(localCdnImageView, paramString);
    AppMethodBeat.o(23323);
  }

  private void cu()
  {
    AppMethodBeat.i(23321);
    if (this.pla == null)
      AppMethodBeat.o(23321);
    while (true)
    {
      return;
      this.pla.removeAllViews();
      if (this.plc >= 0)
      {
        int i = this.plc;
        int j = 0;
        if (j < 5)
        {
          if (i <= 0)
            AT(2131230973);
          while (true)
          {
            j++;
            break;
            if (i <= 10)
            {
              AT(2131230971);
              i -= 20;
            }
            else
            {
              AT(2131230972);
              i -= 20;
            }
          }
        }
        AppMethodBeat.o(23321);
      }
      else
      {
        if (this.plb != null)
        {
          Iterator localIterator = this.plb.iterator();
          while (localIterator.hasNext())
            UN((String)localIterator.next());
        }
        AppMethodBeat.o(23321);
      }
    }
  }

  public final void AS(int paramInt)
  {
    AppMethodBeat.i(23319);
    if (paramInt == this.plc)
      AppMethodBeat.o(23319);
    while (true)
    {
      return;
      this.plc = paramInt;
      cu();
      AppMethodBeat.o(23319);
    }
  }

  public final void cC(List<String> paramList)
  {
    AppMethodBeat.i(23320);
    this.plb = paramList;
    cu();
    AppMethodBeat.o(23320);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23318);
    super.onBindView(paramView);
    this.pla = ((LinearLayout)paramView.findViewById(2131821841));
    cu();
    AppMethodBeat.o(23318);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23317);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    this.mInflater.inflate(2130969220, localViewGroup);
    AppMethodBeat.o(23317);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.BizInfoPayInfoIconPreference
 * JD-Core Version:    0.6.2
 */