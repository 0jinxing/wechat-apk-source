package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class InputPreference extends Preference
{
  private String suV;
  private InputPreference.a suY;
  private View.OnClickListener sva;
  private String yCe;
  private EditText yCf;
  private Button yCg;
  private TextView.OnEditorActionListener yCh;

  public InputPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public InputPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107197);
    this.sva = new InputPreference.1(this);
    this.yCh = new InputPreference.2(this);
    AppMethodBeat.o(107197);
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107198);
    super.onBindView(paramView);
    this.yCf = ((EditText)paramView.findViewById(2131820980));
    this.yCf.setHint(this.suV);
    this.yCf.setOnEditorActionListener(this.yCh);
    this.yCg = ((Button)paramView.findViewById(2131820869));
    this.yCg.setText(this.yCe);
    this.yCg.setOnClickListener(this.sva);
    AppMethodBeat.o(107198);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.InputPreference
 * JD-Core Version:    0.6.2
 */