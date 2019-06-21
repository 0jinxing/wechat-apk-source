package com.tencent.mm.plugin.appbrand.game.widget.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.Editable.Factory;
import android.text.InputFilter;
import android.text.Spannable.Factory;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.c.b;
import com.tencent.mm.plugin.appbrand.widget.input.z;

@SuppressLint({"AppCompatCustomView"})
public class WAGamePanelInputEditText extends EditText
{
  private final Spannable.Factory huA;
  private final z hux;
  private final InputFilter huy;
  private int huz;

  public WAGamePanelInputEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772224);
  }

  public WAGamePanelInputEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(130358);
    this.huy = new WAGamePanelInputEditText.2(this);
    this.huz = 2147483647;
    this.huA = new WAGamePanelInputEditText.3(this);
    this.hux = new z(this);
    super.setEditableFactory(new Editable.Factory()
    {
      public final Editable newEditable(CharSequence paramAnonymousCharSequence)
      {
        AppMethodBeat.i(130355);
        paramAnonymousCharSequence = WAGamePanelInputEditText.a(WAGamePanelInputEditText.this).c((Editable)WAGamePanelInputEditText.a(WAGamePanelInputEditText.this, super.newEditable(paramAnonymousCharSequence)));
        AppMethodBeat.o(130355);
        return paramAnonymousCharSequence;
      }
    });
    AppMethodBeat.o(130358);
  }

  public int getMaxLength()
  {
    return this.huz;
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    AppMethodBeat.i(130360);
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    paramEditorInfo.imeOptions |= 268435456;
    AppMethodBeat.o(130360);
    return localInputConnection;
  }

  public void setComposingDismissedListener(b paramb)
  {
    this.hux.jgz = paramb;
  }

  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    int i = 0;
    AppMethodBeat.i(130359);
    InputFilter[] arrayOfInputFilter = paramArrayOfInputFilter;
    if (this.huy != null)
    {
      arrayOfInputFilter = paramArrayOfInputFilter;
      if (paramArrayOfInputFilter == null)
        arrayOfInputFilter = new InputFilter[0];
      paramArrayOfInputFilter = new InputFilter[arrayOfInputFilter.length + 1];
      while (i < arrayOfInputFilter.length)
      {
        paramArrayOfInputFilter[i] = arrayOfInputFilter[i];
        i++;
      }
      paramArrayOfInputFilter[i] = this.huy;
      arrayOfInputFilter = paramArrayOfInputFilter;
    }
    super.setFilters(arrayOfInputFilter);
    AppMethodBeat.o(130359);
  }

  public void setMaxLength(int paramInt)
  {
    this.huz = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.widget.input.WAGamePanelInputEditText
 * JD-Core Version:    0.6.2
 */