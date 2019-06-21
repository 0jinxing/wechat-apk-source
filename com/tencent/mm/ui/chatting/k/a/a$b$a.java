package com.tencent.mm.ui.chatting.k.a;

import android.text.Spannable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

final class a$b$a
{
  static final class a
    implements a.b.b
  {
    public final a.b.c a(Object paramObject, Spannable paramSpannable)
    {
      AppMethodBeat.i(32677);
      String str = paramSpannable.toString().substring(paramSpannable.getSpanStart(paramObject), paramSpannable.getSpanEnd(paramObject));
      try
      {
        paramSpannable = new org/json/JSONObject;
        paramSpannable.<init>(paramObject.toString());
        paramSpannable = bo.bc(paramSpannable.optString("type"), paramObject.getClass().getName());
        paramObject = paramSpannable;
        paramObject = new a.b.c(str, paramObject);
        AppMethodBeat.o(32677);
        return paramObject;
      }
      catch (JSONException paramSpannable)
      {
        while (true)
          paramObject = paramObject.getClass().getName();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.k.a.a.b.a
 * JD-Core Version:    0.6.2
 */