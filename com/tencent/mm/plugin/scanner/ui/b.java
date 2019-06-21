package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.scanner.util.q;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class b extends Preference
  implements x.a
{
  f ehK;
  String kXM;
  private Context mContext;
  private View mView;
  private ImageView qaL;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(80903);
    this.mView = null;
    this.qaL = null;
    setLayoutResource(2130970377);
    x.a(this);
    this.mContext = paramContext;
    AppMethodBeat.o(80903);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(80904);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(80904);
    return paramView;
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(80906);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(this.kXM)) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.qaL.setImageBitmap(paramBitmap);
      this.qaL.setBackgroundColor(0);
      if (this.ehK != null)
        this.ehK.notifyDataSetChanged();
    }
    AppMethodBeat.o(80906);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(80905);
    super.onBindView(paramView);
    this.qaL = ((ImageView)paramView.findViewById(2131826570));
    if (!bo.isNullOrNil(this.kXM))
    {
      paramView = x.a(new q(this.kXM));
      if ((paramView != null) && (!paramView.isRecycled()))
      {
        this.qaL.setImageBitmap(paramView);
        this.qaL.setBackgroundColor(0);
        AppMethodBeat.o(80905);
      }
    }
    while (true)
    {
      return;
      this.qaL.setBackgroundColor(this.mContext.getResources().getColor(2131690154));
      this.qaL.setImageBitmap(null);
      AppMethodBeat.o(80905);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.b
 * JD-Core Version:    0.6.2
 */