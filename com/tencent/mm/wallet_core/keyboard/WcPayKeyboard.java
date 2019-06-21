package com.tencent.mm.wallet_core.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WcPayKeyboard extends LinearLayout
{
  private TextView AeU;
  private TextView AeV;
  private TextView AeW;
  private TextView AeX;
  private TextView AeY;
  private TextView AeZ;
  private TextView Afa;
  private TextView Afb;
  private TextView Afc;
  private TextView Afd;
  private TextView Afe;
  public TextView Aff;
  private View Afg;
  private TextView kGq;
  private EditText mInputEditText;

  public WcPayKeyboard(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(49015);
    init();
    AppMethodBeat.o(49015);
  }

  public WcPayKeyboard(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(49016);
    init();
    AppMethodBeat.o(49016);
  }

  private void init()
  {
    AppMethodBeat.i(49017);
    LayoutInflater.from(getContext()).inflate(2130971197, this, true);
    this.Afd = ((TextView)findViewById(2131829142));
    this.AeU = ((TextView)findViewById(2131829131));
    this.AeV = ((TextView)findViewById(2131829132));
    this.AeW = ((TextView)findViewById(2131829133));
    this.AeX = ((TextView)findViewById(2131829135));
    this.AeY = ((TextView)findViewById(2131829136));
    this.AeZ = ((TextView)findViewById(2131829137));
    this.Afa = ((TextView)findViewById(2131829139));
    this.Afb = ((TextView)findViewById(2131829140));
    this.Afc = ((TextView)findViewById(2131829141));
    this.Afe = ((TextView)findViewById(2131829143));
    this.Afg = findViewById(2131829134);
    this.Aff = ((TextView)findViewById(2131829138));
    this.kGq = ((TextView)findViewById(2131829130));
    View.OnClickListener local1 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(49014);
        if (WcPayKeyboard.a(WcPayKeyboard.this) == null)
        {
          AppMethodBeat.o(49014);
          return;
        }
        int i;
        if (paramAnonymousView.getId() == 2131829142)
          i = 7;
        while (true)
        {
          WcPayKeyboard.a(WcPayKeyboard.this).dispatchKeyEvent(new KeyEvent(0, i));
          WcPayKeyboard.a(WcPayKeyboard.this).dispatchKeyEvent(new KeyEvent(1, i));
          AppMethodBeat.o(49014);
          break;
          if (paramAnonymousView.getId() == 2131829131)
            i = 8;
          else if (paramAnonymousView.getId() == 2131829132)
            i = 9;
          else if (paramAnonymousView.getId() == 2131829133)
            i = 10;
          else if (paramAnonymousView.getId() == 2131829135)
            i = 11;
          else if (paramAnonymousView.getId() == 2131829136)
            i = 12;
          else if (paramAnonymousView.getId() == 2131829137)
            i = 13;
          else if (paramAnonymousView.getId() == 2131829139)
            i = 14;
          else if (paramAnonymousView.getId() == 2131829140)
            i = 15;
          else if (paramAnonymousView.getId() == 2131829141)
            i = 16;
          else if (paramAnonymousView.getId() == 2131829134)
            i = 67;
          else if (paramAnonymousView.getId() == 2131829143)
            i = 56;
          else if (paramAnonymousView.getId() == 2131829138)
            i = 66;
          else
            i = 0;
        }
      }
    };
    this.Afd.setOnClickListener(local1);
    this.AeU.setOnClickListener(local1);
    this.AeV.setOnClickListener(local1);
    this.AeW.setOnClickListener(local1);
    this.AeX.setOnClickListener(local1);
    this.AeY.setOnClickListener(local1);
    this.AeZ.setOnClickListener(local1);
    this.Afa.setOnClickListener(local1);
    this.Afb.setOnClickListener(local1);
    this.Afc.setOnClickListener(local1);
    this.Afg.setOnClickListener(local1);
    this.Afe.setOnClickListener(local1);
    this.Aff.setOnClickListener(local1);
    AppMethodBeat.o(49017);
  }

  public void setActionText(String paramString)
  {
    AppMethodBeat.i(49018);
    this.Aff.setText(paramString);
    AppMethodBeat.o(49018);
  }

  public void setInputEditText(EditText paramEditText)
  {
    if (paramEditText != null)
      this.mInputEditText = paramEditText;
  }

  public void setTipText(String paramString)
  {
    AppMethodBeat.i(49019);
    this.kGq.setText(paramString);
    if (this.kGq.getVisibility() != 0)
      this.kGq.setVisibility(0);
    AppMethodBeat.o(49019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.keyboard.WcPayKeyboard
 * JD-Core Version:    0.6.2
 */