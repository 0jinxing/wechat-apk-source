package com.tencent.mm.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ab extends LinearLayout
{
  private String hint;
  private EditText iXZ;
  private ImageView lnh;
  private Context mContext;
  private ImageButton mpR;
  private ab.a ypV;

  public ab(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(112462);
    this.mContext = paramContext;
    ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2130968615, this, true);
    this.lnh = ((ImageView)findViewById(2131820974));
    this.lnh.setOnClickListener(new ab.1(this));
    this.iXZ = ((EditText)findViewById(2131820975));
    this.iXZ.requestFocus();
    this.mpR = ((ImageButton)findViewById(2131820976));
    this.mpR.setOnClickListener(new ab.2(this));
    this.iXZ.addTextChangedListener(new ab.3(this));
    AppMethodBeat.o(112462);
  }

  public final EditText getSearchEditText()
  {
    return this.iXZ;
  }

  public final void setHint(String paramString)
  {
    this.hint = paramString;
  }

  public final void setSearchViewListener(ab.a parama)
  {
    this.ypV = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ab
 * JD-Core Version:    0.6.2
 */