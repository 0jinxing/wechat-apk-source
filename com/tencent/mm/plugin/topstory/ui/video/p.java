package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.topstory.a.h;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class p
{
  public static final p sFq;
  chw sFr;

  static
  {
    AppMethodBeat.i(1801);
    sFq = new p();
    AppMethodBeat.o(1801);
  }

  static JSONArray dO(List<tn> paramList)
  {
    AppMethodBeat.i(1800);
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    while (true)
    {
      if (i < paramList.size());
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        tn localtn = (tn)paramList.get(i);
        localJSONObject.put("key", localtn.key);
        localJSONObject.put("uintValue", localtn.waD);
        localJSONObject.put("textValue", localtn.waE);
        localJSONArray.put(localJSONObject);
        label88: i++;
        continue;
        AppMethodBeat.o(1800);
        return localJSONArray;
      }
      catch (Exception localException)
      {
        break label88;
      }
    }
  }

  static boolean g(chw paramchw)
  {
    if ((paramchw.xhe == 100201L) || (paramchw.xhe == 100203L));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final void a(b paramb, int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(1799);
    if (paramInt1 == 1024)
    {
      if (paramInt2 != -1)
        break label228;
      Toast.makeText(ah.getContext(), 2131297050, 1).show();
      h.a(paramb.cFT(), this.sFr, "1", r.Yz(), "");
      AppMethodBeat.o(1799);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 2048) && (paramInt2 == -1))
      {
        Object localObject = paramIntent.getStringArrayListExtra("SendMsgUsernames");
        if ((localObject != null) && (((ArrayList)localObject).size() > 0))
        {
          StringBuilder localStringBuilder = new StringBuilder("");
          paramIntent = new StringBuilder("");
          localObject = ((ArrayList)localObject).iterator();
          if (((Iterator)localObject).hasNext())
          {
            String str = (String)((Iterator)localObject).next();
            if (t.kH(str))
            {
              localStringBuilder.append(3);
              localStringBuilder.append(";");
            }
            while (true)
            {
              paramIntent.append(str);
              paramIntent.append(";");
              break;
              localStringBuilder.append(2);
              localStringBuilder.append(";");
            }
          }
          h.a(paramb.cFT(), this.sFr, localStringBuilder.toString(), r.Yz(), paramIntent.toString());
        }
      }
      label228: AppMethodBeat.o(1799);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.p
 * JD-Core Version:    0.6.2
 */