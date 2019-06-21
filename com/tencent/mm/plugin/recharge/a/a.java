package com.tencent.mm.plugin.recharge.a;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class a
  implements at
{
  private List<com.tencent.mm.plugin.recharge.model.a> pFJ = null;

  public static a cea()
  {
    AppMethodBeat.i(44176);
    a locala = (a)q.Y(a.class);
    AppMethodBeat.o(44176);
    return locala;
  }

  public static com.tencent.mm.plugin.recharge.model.a cec()
  {
    AppMethodBeat.i(44180);
    Object localObject = (String)g.RP().Ry().get(6, null);
    if (!bo.isNullOrNil((String)localObject))
    {
      localObject = new com.tencent.mm.plugin.recharge.model.a((String)localObject, ah.getContext().getString(2131305280), 3);
      AppMethodBeat.o(44180);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(44180);
      localObject = null;
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final boolean a(com.tencent.mm.plugin.recharge.model.a parama)
  {
    AppMethodBeat.i(44177);
    boolean bool;
    if ((parama != null) && (PhoneNumberUtils.isGlobalPhoneNumber(parama.pFM)))
    {
      List localList = ceb();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.recharge.model.a locala = (com.tencent.mm.plugin.recharge.model.a)localIterator.next();
        if (parama.pFM.equals(locala.pFM))
        {
          if (bo.isNullOrNil(parama.name))
            parama.name = locala.name;
          localList.remove(locala);
        }
      }
      localList.add(0, parama);
      cK(localList);
      bool = true;
      AppMethodBeat.o(44177);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(44177);
      bool = false;
    }
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
  }

  public final void cK(List<com.tencent.mm.plugin.recharge.model.a> paramList)
  {
    AppMethodBeat.i(44178);
    this.pFJ = paramList;
    if ((paramList == null) || (paramList.size() == 0))
      this.pFJ = new LinkedList();
    JSONArray localJSONArray;
    while (true)
    {
      localJSONArray = new JSONArray();
      paramList = this.pFJ.iterator();
      while (paramList.hasNext())
      {
        com.tencent.mm.plugin.recharge.model.a locala = (com.tencent.mm.plugin.recharge.model.a)paramList.next();
        localJSONArray.put(locala.toJson());
        ab.i("MicroMsg.SubCoreRecharge", "number: %s", new Object[] { locala.name });
      }
      if (paramList.size() > 10)
        for (int i = paramList.size() - 1; i >= 10; i--)
          paramList.remove(i);
    }
    ab.d("MicroMsg.SubCoreRecharge", "setMobileHistory : " + localJSONArray.toString());
    g.RP().Ry().set(270337, localJSONArray.toString());
    g.RP().Ry().dsb();
    AppMethodBeat.o(44178);
  }

  public final List<com.tencent.mm.plugin.recharge.model.a> ceb()
  {
    AppMethodBeat.i(44179);
    Object localObject;
    if (this.pFJ != null)
    {
      localObject = this.pFJ;
      AppMethodBeat.o(44179);
    }
    while (true)
    {
      return localObject;
      this.pFJ = new LinkedList();
      localObject = (String)g.RP().Ry().get(270337, null);
      if (bo.isNullOrNil((String)localObject))
      {
        ab.i("MicroMsg.SubCoreRecharge", "empty history");
        localObject = this.pFJ;
        AppMethodBeat.o(44179);
      }
      else
      {
        try
        {
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>((String)localObject);
          for (i = 0; i < Math.min(localJSONArray.length(), 100); i++)
          {
            com.tencent.mm.plugin.recharge.model.a locala = com.tencent.mm.plugin.recharge.model.a.aj(localJSONArray.getJSONObject(i));
            if (locala != null)
              this.pFJ.add(locala);
          }
        }
        catch (JSONException localJSONException)
        {
          int i;
          ab.printErrStackTrace("MicroMsg.SubCoreRecharge", localJSONException, "", new Object[0]);
          localObject = ((String)localObject).split("&");
          if ((localObject != null) && (localObject.length > 0))
          {
            i = 0;
            if (i < Math.min(localObject.length, 100))
            {
              String[] arrayOfString = localObject[i].split("=");
              if (arrayOfString.length == 2)
                this.pFJ.add(new com.tencent.mm.plugin.recharge.model.a(arrayOfString[0], arrayOfString[1], 2));
              while (true)
              {
                i++;
                break;
                if (arrayOfString.length == 1)
                  this.pFJ.add(new com.tencent.mm.plugin.recharge.model.a(arrayOfString[0], "", 2));
              }
            }
          }
          ab.i("MicroMsg.SubCoreRecharge", "getMobileHistory : " + this.pFJ.size());
          localObject = this.pFJ;
          AppMethodBeat.o(44179);
        }
      }
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.a.a
 * JD-Core Version:    0.6.2
 */