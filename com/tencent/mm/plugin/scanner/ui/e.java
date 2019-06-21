package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public final class e extends Preference
{
  private Context context;
  private TextView gne;
  private View.OnTouchListener mNa;
  String mTitle;
  private View mView;
  private TextView pnu;
  private final int qcj;
  private TextView qck;
  public boolean qcl;
  public boolean qcm;
  private Boolean qcn;
  private ViewTreeObserver.OnGlobalLayoutListener qco;
  e.a qcp;

  public e(Activity paramActivity)
  {
    super(paramActivity);
    AppMethodBeat.i(81020);
    this.qcj = 5;
    this.qcl = false;
    this.qcm = false;
    setLayoutResource(2130970173);
    this.context = paramActivity;
    AppMethodBeat.o(81020);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81021);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(81021);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(81022);
    super.onBindView(paramView);
    if (this.gne == null)
      this.gne = ((TextView)paramView.findViewById(16908310));
    if (this.pnu == null)
      this.pnu = ((TextView)paramView.findViewById(16908304));
    if (this.qck == null)
      this.qck = ((TextView)paramView.findViewById(2131826055));
    if (this.mNa == null)
    {
      this.mNa = new e.1(this);
      this.qck.setOnTouchListener(this.mNa);
    }
    if (this.qcp != null)
    {
      this.qcn = this.qcp.Wg(this.mKey);
      if (this.qcn != null)
        if (this.qcn.booleanValue())
        {
          this.qck.setVisibility(8);
          this.pnu.setMaxLines(2000);
          if (this.qco == null)
          {
            this.qco = new e.2(this);
            this.pnu.getViewTreeObserver().addOnGlobalLayoutListener(this.qco);
          }
          if (!bo.isNullOrNil(this.mTitle))
            break label279;
          this.gne.setVisibility(8);
          AppMethodBeat.o(81022);
        }
    }
    while (true)
    {
      return;
      this.qck.setVisibility(0);
      this.pnu.setMaxLines(5);
      break;
      this.qck.setVisibility(8);
      this.pnu.setMaxLines(6);
      break;
      this.qck.setVisibility(8);
      this.pnu.setMaxLines(6);
      break;
      label279: this.gne.setText(this.mTitle);
      this.gne.setVisibility(0);
      AppMethodBeat.o(81022);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.e
 * JD-Core Version:    0.6.2
 */