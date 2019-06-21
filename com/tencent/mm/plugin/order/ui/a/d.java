package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.order.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public final class d extends Preference
{
  String kWC;
  String mName;
  View.OnClickListener mOnClickListener;
  private View mView;

  public d(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43901);
    this.mView = null;
    setLayoutResource(2130970044);
    AppMethodBeat.o(43901);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43902);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(43902);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43903);
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(2131825804);
    TextView localTextView = (TextView)paramView.findViewById(2131825805);
    localImageView.setImageBitmap(null);
    if (!bo.isNullOrNil(this.kWC))
    {
      Object localObject = new c.a();
      b.bYR();
      ((c.a)localObject).ePK = b.bKP();
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePZ = true;
      ((c.a)localObject).eQf = true;
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.kWC, localImageView, (c)localObject);
    }
    localTextView.setText(this.mName);
    paramView.findViewById(2131825803).setOnClickListener(this.mOnClickListener);
    AppMethodBeat.o(43903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.d
 * JD-Core Version:    0.6.2
 */