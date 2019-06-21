package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R.a;
import com.tencent.mm.pluginsdk.ui.ProfileItemView;
import com.tencent.mm.sdk.platformtools.bo;

public class ProfileNormalItemView extends ProfileItemView
{
  private TextView iDT;
  String mTitle;
  private TextView pip;
  CharSequence ppl;
  View.OnClickListener ppm;
  private View ppn;

  public ProfileNormalItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23753);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.a.ProfileNormalItemView);
    this.mTitle = paramContext.getString(0);
    paramContext.recycle();
    AppMethodBeat.o(23753);
  }

  public ProfileNormalItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final ProfileNormalItemView Bg(int paramInt)
  {
    AppMethodBeat.i(23755);
    this.mTitle = getContext().getString(paramInt);
    AppMethodBeat.o(23755);
    return this;
  }

  public final ProfileNormalItemView Bh(int paramInt)
  {
    AppMethodBeat.i(23756);
    this.ppl = getContext().getString(paramInt);
    AppMethodBeat.o(23756);
    return this;
  }

  public final ProfileNormalItemView Bi(int paramInt)
  {
    AppMethodBeat.i(23757);
    this.pip.setTextColor(paramInt);
    AppMethodBeat.o(23757);
    return this;
  }

  public final ProfileNormalItemView cbw()
  {
    AppMethodBeat.i(23758);
    this.pip.setSingleLine(false);
    AppMethodBeat.o(23758);
    return this;
  }

  public final ProfileNormalItemView cbx()
  {
    AppMethodBeat.i(23759);
    this.ppn.setVisibility(0);
    AppMethodBeat.o(23759);
    return this;
  }

  public final boolean cby()
  {
    boolean bool = false;
    AppMethodBeat.i(23760);
    this.iDT.setText(this.mTitle);
    if (bo.ac(this.ppl))
    {
      setVisibility(8);
      AppMethodBeat.o(23760);
    }
    while (true)
    {
      return bool;
      setVisibility(0);
      this.pip.setText(this.ppl);
      setOnClickListener(this.ppm);
      bool = true;
      AppMethodBeat.o(23760);
    }
  }

  public int getLayout()
  {
    return 2130970410;
  }

  public final void init()
  {
    AppMethodBeat.i(23754);
    this.iDT = ((TextView)findViewById(2131826663));
    this.pip = ((TextView)findViewById(2131826664));
    this.ppn = findViewById(2131821517);
    AppMethodBeat.o(23754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ProfileNormalItemView
 * JD-Core Version:    0.6.2
 */