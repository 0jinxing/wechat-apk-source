package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.scanner.util.q;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class a extends Preference
  implements x.a
{
  private f iFE;
  private ImageView iUn;
  String kWC;
  private View mView;
  private TextView qaI;
  String qaJ;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(80899);
    this.mView = null;
    this.qaI = null;
    this.qaJ = null;
    setLayoutResource(2130970549);
    x.a(this);
    AppMethodBeat.o(80899);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(80900);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(80900);
    return paramView;
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(80902);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(this.kWC)) && (paramBitmap != null) && (!paramBitmap.isRecycled()) && (this.iUn != null))
      al.d(new a.1(this, paramBitmap));
    AppMethodBeat.o(80902);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(80901);
    super.onBindView(paramView);
    this.qaI = ((TextView)paramView.findViewById(2131822459));
    this.iUn = ((ImageView)paramView.findViewById(2131827214));
    if (!bo.isNullOrNil(this.qaJ))
    {
      this.qaI.setText(this.qaJ);
      this.qaI.setVisibility(0);
    }
    while (true)
    {
      if (!bo.isNullOrNil(this.kWC))
      {
        paramView = x.a(new q(this.kWC));
        if ((paramView != null) && (!paramView.isRecycled()))
        {
          this.iUn.setImageBitmap(paramView);
          this.iUn.setVisibility(0);
        }
      }
      AppMethodBeat.o(80901);
      return;
      this.qaI.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.a
 * JD-Core Version:    0.6.2
 */