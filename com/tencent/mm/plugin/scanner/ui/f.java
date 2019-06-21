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
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public final class f extends Preference
  implements x.a
{
  com.tencent.mm.ui.base.preference.f ehK;
  String kXM;
  private Context mContext;
  private View mView;
  private ImageView qaL;

  public f(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(81031);
    this.mView = null;
    this.qaL = null;
    setLayoutResource(2130970391);
    x.a(this);
    this.mContext = paramContext;
    AppMethodBeat.o(81031);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81032);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(81032);
    return paramView;
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(81034);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(this.kXM)) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
      al.d(new f.1(this, paramBitmap));
    AppMethodBeat.o(81034);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(81033);
    super.onBindView(paramView);
    this.qaL = ((ImageView)paramView.findViewById(2131822355));
    if (!bo.isNullOrNil(this.kXM))
    {
      Bitmap localBitmap = x.a(new q(this.kXM));
      if ((localBitmap == null) || (localBitmap.isRecycled()))
        break label94;
      this.qaL.setImageBitmap(localBitmap);
      this.qaL.setBackgroundColor(0);
    }
    while (true)
    {
      ((ImageView)paramView.findViewById(2131826601)).setVisibility(0);
      AppMethodBeat.o(81033);
      return;
      label94: this.qaL.setBackgroundColor(this.mContext.getResources().getColor(2131690154));
      this.qaL.setImageBitmap(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.f
 * JD-Core Version:    0.6.2
 */