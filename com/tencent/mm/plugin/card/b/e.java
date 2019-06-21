package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.CardInfo;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  public Map<String, Object> kaV;
  public CardInfo kau;

  public e()
  {
    AppMethodBeat.i(87671);
    this.kaV = new HashMap();
    this.kau = null;
    this.kaV.clear();
    AppMethodBeat.o(87671);
  }

  public final Object getValue(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(87673);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(87673);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (this.kaV.containsKey(paramString))
      {
        paramString = this.kaV.get(paramString);
        AppMethodBeat.o(87673);
      }
      else
      {
        AppMethodBeat.o(87673);
        paramString = localObject;
      }
    }
  }

  public final void putValue(String paramString, Object paramObject)
  {
    AppMethodBeat.i(87672);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(87672);
    while (true)
    {
      return;
      this.kaV.put(paramString, paramObject);
      AppMethodBeat.o(87672);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.e
 * JD-Core Version:    0.6.2
 */