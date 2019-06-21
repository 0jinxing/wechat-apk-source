package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.e.c.b;
import com.tencent.mm.ui.widget.edittext.PasterEditText;

public class MMEditText extends PasterEditText
{
  int uQn = 0;
  private InputConnection zMl;
  private a zMm;

  public MMEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void ajp(String paramString)
  {
    AppMethodBeat.i(107882);
    int i = getSelectionStart();
    setText(b.c(getContext(), paramString, getTextSize()));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      i += j;
      if (i <= getText().length())
        setSelection(i);
      AppMethodBeat.o(107882);
    }
    while (true)
    {
      return;
      setSelection(i);
      AppMethodBeat.o(107882);
    }
  }

  public final void asB(String paramString)
  {
    AppMethodBeat.i(107877);
    getContext();
    int i = b.bV(getText().toString(), getSelectionStart());
    getContext();
    int j = b.bV(getText().toString(), getSelectionEnd());
    Object localObject = new StringBuffer(getText());
    localObject = ((StringBuffer)localObject).substring(0, i) + paramString + ((StringBuffer)localObject).substring(j, ((StringBuffer)localObject).length());
    j = -1;
    int k = j;
    int n;
    if (d.iW(21))
    {
      InputFilter[] arrayOfInputFilter = getFilters();
      k = j;
      if (arrayOfInputFilter != null)
      {
        int m = arrayOfInputFilter.length;
        n = 0;
        k = j;
        if (n < m)
        {
          InputFilter localInputFilter = arrayOfInputFilter[n];
          if (!(localInputFilter instanceof InputFilter.LengthFilter))
            break label253;
          j = ((InputFilter.LengthFilter)localInputFilter).getMax();
        }
      }
    }
    label253: 
    while (true)
    {
      n++;
      break;
      j = paramString.length() + i;
      if ((k > 0) && (j > k))
      {
        ab.d("MicroMsg.MMEditText", "exceed :%s, %s", new Object[] { Integer.valueOf(k), Integer.valueOf(j) });
        AppMethodBeat.o(107877);
      }
      while (true)
      {
        return;
        setText(b.c(getContext(), (CharSequence)localObject, getTextSize()));
        setSelection(j);
        AppMethodBeat.o(107877);
      }
    }
  }

  public InputConnection getInputConnection()
  {
    return this.zMl;
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    AppMethodBeat.i(107876);
    this.zMl = super.onCreateInputConnection(paramEditorInfo);
    paramEditorInfo = this.zMl;
    AppMethodBeat.o(107876);
    return paramEditorInfo;
  }

  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(107883);
    boolean bool2;
    KeyEvent.DispatcherState localDispatcherState;
    if (this.zMm == null)
    {
      bool2 = true;
      ab.v("MicroMsg.MMEditText", "on onKeyPreIme, listener null ? %B", new Object[] { Boolean.valueOf(bool2) });
      if ((this.zMm == null) || (paramInt != 4))
        break label204;
      if ((paramKeyEvent.getAction() != 0) || (paramKeyEvent.getRepeatCount() != 0))
        break label104;
      ab.v("MicroMsg.MMEditText", "on onKeyPreIme action down");
      localDispatcherState = getKeyDispatcherState();
      if (localDispatcherState != null)
        localDispatcherState.startTracking(paramKeyEvent, this);
      AppMethodBeat.o(107883);
      bool2 = bool1;
    }
    label204: 
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label104: if (paramKeyEvent.getAction() == 1)
      {
        ab.v("MicroMsg.MMEditText", "on onKeyPreIme action up");
        localDispatcherState = getKeyDispatcherState();
        if (localDispatcherState != null)
          localDispatcherState.handleUpEvent(paramKeyEvent);
        if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
        {
          ab.v("MicroMsg.MMEditText", "on onKeyPreIme action up is tracking");
          this.zMm.bMu();
          paramKeyEvent = (InputMethodManager)getContext().getSystemService("input_method");
          if (paramKeyEvent != null)
            paramKeyEvent.hideSoftInputFromWindow(getWindowToken(), 0);
          AppMethodBeat.o(107883);
          bool2 = bool1;
        }
      }
      else
      {
        bool2 = super.onKeyPreIme(paramInt, paramKeyEvent);
        AppMethodBeat.o(107883);
      }
    }
  }

  // ERROR //
  public boolean onTextContextMenuItem(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 233
    //   4: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: iload_1
    //   9: invokespecial 235	com/tencent/mm/ui/widget/edittext/PasterEditText:onTextContextMenuItem	(I)Z
    //   12: istore_3
    //   13: iload_3
    //   14: istore_2
    //   15: iload_1
    //   16: ldc 236
    //   18: if_icmpne +23 -> 41
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield 25	com/tencent/mm/ui/widget/MMEditText:uQn	I
    //   26: aload_0
    //   27: invokevirtual 63	com/tencent/mm/ui/widget/MMEditText:getText	()Landroid/text/Editable;
    //   30: invokevirtual 85	java/lang/Object:toString	()Ljava/lang/String;
    //   33: astore 4
    //   35: aload_0
    //   36: aload 4
    //   38: invokespecial 238	com/tencent/mm/ui/widget/MMEditText:ajp	(Ljava/lang/String;)V
    //   41: ldc 233
    //   43: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: iload_2
    //   47: ireturn
    //   48: astore 5
    //   50: ldc 128
    //   52: ldc 240
    //   54: iconst_1
    //   55: anewarray 81	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload 5
    //   62: aastore
    //   63: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   66: iconst_0
    //   67: istore_2
    //   68: goto -53 -> 15
    //   71: astore 5
    //   73: ldc 128
    //   75: ldc 245
    //   77: iconst_1
    //   78: anewarray 81	java/lang/Object
    //   81: dup
    //   82: iconst_0
    //   83: aload 5
    //   85: aastore
    //   86: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: ldc 233
    //   91: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: goto -48 -> 46
    //   97: astore 5
    //   99: ldc 128
    //   101: ldc 247
    //   103: iconst_1
    //   104: anewarray 81	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: aload_0
    //   110: getfield 25	com/tencent/mm/ui/widget/MMEditText:uQn	I
    //   113: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   116: aastore
    //   117: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: aload_0
    //   121: getfield 25	com/tencent/mm/ui/widget/MMEditText:uQn	I
    //   124: iconst_3
    //   125: if_icmpge +30 -> 155
    //   128: aload_0
    //   129: aload_0
    //   130: getfield 25	com/tencent/mm/ui/widget/MMEditText:uQn	I
    //   133: iconst_1
    //   134: iadd
    //   135: putfield 25	com/tencent/mm/ui/widget/MMEditText:uQn	I
    //   138: aload_0
    //   139: ldc 249
    //   141: aload 4
    //   143: invokestatic 252	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   146: invokevirtual 256	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial 238	com/tencent/mm/ui/widget/MMEditText:ajp	(Ljava/lang/String;)V
    //   152: goto -111 -> 41
    //   155: ldc 233
    //   157: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: aload 5
    //   162: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   7	13	48	java/lang/IndexOutOfBoundsException
    //   7	13	71	java/lang/NullPointerException
    //   35	41	97	java/lang/IndexOutOfBoundsException
  }

  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    boolean bool1 = false;
    AppMethodBeat.i(107878);
    try
    {
      bool2 = super.requestFocus(paramInt, paramRect);
      AppMethodBeat.o(107878);
      return bool2;
    }
    catch (IllegalStateException paramRect)
    {
      while (true)
      {
        ab.e("MicroMsg.MMEditText", "[requestFocus] error:%s", new Object[] { paramRect });
        AppMethodBeat.o(107878);
        boolean bool2 = bool1;
      }
    }
  }

  public void setBackListener(a parama)
  {
    this.zMm = parama;
  }

  public void setSelection(int paramInt)
  {
    AppMethodBeat.i(107879);
    try
    {
      super.setSelection(paramInt);
      AppMethodBeat.o(107879);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMEditText", localIndexOutOfBoundsException, "IndexOutOfBoundsExceptionindex = ".concat(String.valueOf(paramInt)), new Object[0]);
        AppMethodBeat.o(107879);
      }
    }
  }

  public void setSelection(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107880);
    super.setSelection(paramInt1, paramInt2);
    AppMethodBeat.o(107880);
  }

  public static abstract interface a
  {
    public abstract void bMu();
  }

  public static abstract interface b
  {
    public abstract void aqH();
  }

  public static final class c
    implements TextWatcher
  {
    private final int limit;
    private EditText pwu;
    private TextView zMn;
    public MMEditText.b zMo = null;
    private boolean zMp = false;

    public c(EditText paramEditText, TextView paramTextView, int paramInt)
    {
      this.pwu = paramEditText;
      this.zMn = paramTextView;
      this.limit = paramInt;
    }

    public final void afterTextChanged(Editable paramEditable)
    {
      int i = 0;
      AppMethodBeat.i(107874);
      String str = paramEditable.toString();
      paramEditable = "";
      int j = 0;
      int k = 0;
      int m = k;
      if (j < str.length())
      {
        if (bo.y(str.charAt(j)))
          k += 2;
        while (true)
        {
          m = k;
          if (k > this.limit)
            break label98;
          paramEditable = paramEditable + str.charAt(j);
          j++;
          break;
          k++;
        }
      }
      label98: if (m > this.limit);
      try
      {
        this.pwu.setText(paramEditable);
        if (!this.zMp)
        {
          k = this.pwu.getText().toString().length();
          this.pwu.setSelection(k);
        }
        while (true)
        {
          this.zMp = false;
          k = this.limit - m;
          if (k >= 0)
            break;
          k = i;
          if (this.zMn != null)
            this.zMn.setText(k / 2);
          AppMethodBeat.o(107874);
          return;
          this.pwu.setSelection(0);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          this.zMp = true;
          ab.e("MicroMsg.MMEditText", "error ".concat(String.valueOf(localException.getMessage())));
          this.pwu.setText(paramEditable);
          this.pwu.setSelection(0);
        }
      }
    }

    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      AppMethodBeat.i(107875);
      if (this.zMo != null)
        this.zMo.aqH();
      AppMethodBeat.o(107875);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMEditText
 * JD-Core Version:    0.6.2
 */