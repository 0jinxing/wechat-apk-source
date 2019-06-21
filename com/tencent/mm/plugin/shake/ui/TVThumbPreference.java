package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.shake.e.b;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.List;

public class TVThumbPreference extends Preference
  implements x.a
{
  f iFE;
  private ImageView qwI;
  private ImageView qwJ;
  private ImageView qwK;
  List<String> qwL;

  public TVThumbPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public TVThumbPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public TVThumbPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(24939);
    this.qwL = null;
    setLayoutResource(2130970974);
    setWidgetLayoutResource(0);
    x.a(this);
    AppMethodBeat.o(24939);
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(24942);
    if ((paramString == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
      AppMethodBeat.o(24942);
    while (true)
    {
      return;
      if ((this.qwI != null) && (this.qwI.getTag() != null) && (paramString.equals((String)this.qwI.getTag())))
      {
        this.qwI.post(new TVThumbPreference.1(this, paramBitmap));
        AppMethodBeat.o(24942);
      }
      else if ((this.qwJ != null) && (this.qwJ.getTag() != null) && (paramString.equals((String)this.qwJ.getTag())))
      {
        this.qwJ.post(new TVThumbPreference.2(this, paramBitmap));
        AppMethodBeat.o(24942);
      }
      else
      {
        if ((this.qwK != null) && (this.qwK.getTag() != null) && (paramString.equals((String)this.qwK.getTag())))
          this.qwK.post(new TVThumbPreference.3(this, paramBitmap));
        AppMethodBeat.o(24942);
      }
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(24941);
    super.onBindView(paramView);
    this.qwI = ((ImageView)paramView.findViewById(2131828371));
    this.qwJ = ((ImageView)paramView.findViewById(2131828372));
    this.qwK = ((ImageView)paramView.findViewById(2131828373));
    if (this.qwL != null)
      if (this.qwL.size() <= 0)
        AppMethodBeat.o(24941);
    while (true)
    {
      return;
      paramView = new b((String)this.qwL.get(0));
      this.qwI.setTag(paramView.anL());
      paramView = x.a(paramView);
      if ((paramView != null) && (!paramView.isRecycled()))
        this.qwI.setImageBitmap(paramView);
      this.qwI.setVisibility(0);
      if (1 >= this.qwL.size())
      {
        AppMethodBeat.o(24941);
      }
      else
      {
        paramView = new b((String)this.qwL.get(1));
        this.qwJ.setTag(paramView.anL());
        paramView = x.a(paramView);
        if ((paramView != null) && (!paramView.isRecycled()))
          this.qwJ.setImageBitmap(paramView);
        this.qwJ.setVisibility(0);
        if (2 >= this.qwL.size())
        {
          AppMethodBeat.o(24941);
        }
        else
        {
          paramView = new b((String)this.qwL.get(2));
          this.qwK.setTag(paramView.anL());
          paramView = x.a(paramView);
          if ((paramView != null) && (!paramView.isRecycled()))
            this.qwK.setImageBitmap(paramView);
          this.qwK.setVisibility(0);
          AppMethodBeat.o(24941);
        }
      }
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(24940);
    paramViewGroup = super.onCreateView(paramViewGroup);
    AppMethodBeat.o(24940);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.TVThumbPreference
 * JD-Core Version:    0.6.2
 */