package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends a
{
  public ArrayList<PayUSecurityQuestion> tUM;

  public d()
  {
    AppMethodBeat.i(48572);
    M(new HashMap());
    AppMethodBeat.o(48572);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48573);
    if (paramJSONObject != null)
    {
      this.tUM = new ArrayList();
      paramString = paramJSONObject.optJSONArray("security_question_list");
      if (paramString != null)
        for (paramInt = 0; paramInt < paramString.length(); paramInt++)
        {
          paramJSONObject = paramString.optJSONObject(paramInt);
          if (paramJSONObject != null)
          {
            paramJSONObject = new PayUSecurityQuestion(paramJSONObject.optString("id"), paramJSONObject.optString("description"));
            this.tUM.add(paramJSONObject);
          }
        }
    }
    AppMethodBeat.o(48573);
  }

  public final int cOX()
  {
    return 11;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.model.d
 * JD-Core Version:    0.6.2
 */