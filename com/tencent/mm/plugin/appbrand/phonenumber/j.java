package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItemsManager;", "", "()V", "Companion", "plugin-appbrand-integration_release"})
public final class j
{
  private static final String TAG = "MicroMsg.PhoneItemsManager";
  private static final String ixP = "PhoneItemsManager#PhoneItems";
  public static final a ixQ;
  private static final ArrayList<PhoneItem> ixy;

  static
  {
    AppMethodBeat.i(134813);
    ixQ = new a((byte)0);
    TAG = "MicroMsg.PhoneItemsManager";
    ixP = "PhoneItemsManager#PhoneItems";
    ixy = new ArrayList();
    AppMethodBeat.o(134813);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItemsManager$Companion;", "", "()V", "PHONE_ITEMS", "", "getPHONE_ITEMS", "()Ljava/lang/String;", "TAG", "phoneItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Lkotlin/collections/ArrayList;", "add", "", "phoneItem", "get", "", "init", "newPhoneItems", "remove", "delPhoneItems", "uninit", "updatePhoneItem", "update", "plugin-appbrand-integration_release"})
  public static final class a
  {
    private static List<PhoneItem> aKO()
    {
      AppMethodBeat.i(134812);
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(f.xH().get(j.aKL(), ""));
        localArrayList = new ArrayList();
        if (localJSONArray != null)
        {
          int i = localJSONArray.length() - 1;
          if (i >= 0)
            for (int j = 0; ; j++)
            {
              Object localObject2 = PhoneItem.ixO;
              localObject2 = localJSONArray.getString(j);
              a.f.b.j.o(localObject2, "jsonArray.getString(i)");
              localObject2 = PhoneItem.a.Ds((String)localObject2);
              if (localObject2 != null)
                localArrayList.add(localObject2);
              if (j == i)
                break;
            }
        }
      }
      catch (Exception localException)
      {
        ArrayList localArrayList;
        while (true)
          localObject1 = null;
        d.d(j.access$getTAG$cp(), "get %s", new Object[] { String.valueOf(localObject1) });
        Object localObject1 = (List)localArrayList;
        AppMethodBeat.o(134812);
        return localObject1;
      }
    }

    public final void a(PhoneItem paramPhoneItem)
    {
      try
      {
        AppMethodBeat.i(134810);
        a.f.b.j.p(paramPhoneItem, "phoneItem");
        Iterator localIterator = j.aKM().iterator();
        while (localIterator.hasNext())
          ((PhoneItem)localIterator.next()).ixN = false;
      }
      finally
      {
      }
      if (j.aKM().contains(paramPhoneItem))
      {
        j.aKM().set(j.aKM().indexOf(paramPhoneItem), paramPhoneItem);
        AppMethodBeat.o(134810);
      }
      while (true)
      {
        return;
        j.aKM().add(paramPhoneItem);
        AppMethodBeat.o(134810);
      }
    }

    public final List<PhoneItem> aKN()
    {
      try
      {
        AppMethodBeat.i(134808);
        List localList = (List)j.aKM();
        AppMethodBeat.o(134808);
        return localList;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }

    public final void aM(List<PhoneItem> paramList)
    {
      while (true)
      {
        try
        {
          AppMethodBeat.i(134807);
          a.f.b.j.p(paramList, "newPhoneItems");
          j.aKM().clear();
          j.aKM().addAll((Collection)paramList);
          List localList = aKO();
          Iterator localIterator = localList.iterator();
          if (localIterator.hasNext())
          {
            paramList = (PhoneItem)localIterator.next();
            if (!paramList.ixN)
              continue;
            localIterator = j.aKM().iterator();
            if (localIterator.hasNext())
            {
              PhoneItem localPhoneItem = (PhoneItem)localIterator.next();
              if (!a.f.b.j.j(paramList.cFl, localPhoneItem.cFl))
                continue;
              localPhoneItem.ixN = true;
              i = 1;
              if ((i == 0) && (j.aKM().size() > 0))
                ((PhoneItem)j.aKM().get(0)).ixN = true;
              d.v(j.access$getTAG$cp(), "init oldphoneItems:%s", new Object[] { localList });
              d.v(j.access$getTAG$cp(), "init phoneItems:%s", new Object[] { j.aKM() });
              AppMethodBeat.o(134807);
              return;
            }
            i = 0;
            continue;
          }
        }
        finally
        {
        }
        int i = 0;
      }
    }

    public final void b(PhoneItem paramPhoneItem)
    {
      try
      {
        AppMethodBeat.i(134811);
        if (paramPhoneItem == null)
          break label96;
        localObject1 = j.aKM().iterator();
        while (((Iterator)localObject1).hasNext())
          ((PhoneItem)((Iterator)localObject1).next()).ixN = false;
      }
      finally
      {
      }
      Object localObject1 = j.aKM().iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (PhoneItem)((Iterator)localObject1).next();
        if (a.f.b.j.j(paramPhoneItem.cFl, ((PhoneItem)localObject2).cFl))
          ((PhoneItem)localObject2).ixN = true;
      }
      label96: localObject1 = (List)j.aKM();
      paramPhoneItem = new org/json/JSONArray;
      paramPhoneItem.<init>();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (PhoneItem)((Iterator)localObject1).next();
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("mobile", ((PhoneItem)localObject2).cFl);
        localJSONObject.put("show_mobile", ((PhoneItem)localObject2).ixI);
        localJSONObject.put("need_auth", ((PhoneItem)localObject2).ixK);
        localJSONObject.put("allow_send_sms", ((PhoneItem)localObject2).ixL);
        localJSONObject.put("encryptedData", ((PhoneItem)localObject2).ixJ);
        localJSONObject.put("iv", ((PhoneItem)localObject2).biC);
        localJSONObject.put("is_wechat", ((PhoneItem)localObject2).ixM);
        localJSONObject.put("is_check", ((PhoneItem)localObject2).ixN);
        localObject2 = localJSONObject.toString();
        a.f.b.j.o(localObject2, "jsonObject.toString()");
        paramPhoneItem.put(localObject2);
      }
      d.d(j.access$getTAG$cp(), "update %s", new Object[] { paramPhoneItem.toString() });
      f.xH().bG(j.aKL(), paramPhoneItem.toString());
      d.v(j.access$getTAG$cp(), "uninit phoneItems:%s", new Object[] { j.aKM() });
      j.aKM().clear();
      AppMethodBeat.o(134811);
    }

    public final void o(ArrayList<PhoneItem> paramArrayList)
    {
      ArrayList localArrayList;
      try
      {
        AppMethodBeat.i(134809);
        if (paramArrayList == null)
        {
          d.w(j.access$getTAG$cp(), "delPhoneItems is null");
          AppMethodBeat.o(134809);
          return;
        }
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>((Collection)j.aKM());
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext())
          localArrayList.remove((PhoneItem)paramArrayList.next());
      }
      finally
      {
      }
      j.aKM().clear();
      j.aKM().addAll((Collection)localArrayList);
      paramArrayList = j.aKM().iterator();
      do
        if (!paramArrayList.hasNext())
          break;
      while (!((PhoneItem)paramArrayList.next()).ixN);
      for (int i = 1; ; i = 0)
      {
        if ((i == 0) && (j.aKM().size() > 0))
          ((PhoneItem)j.aKM().get(0)).ixN = true;
        d.v(j.access$getTAG$cp(), "remove phoneItems:%s", new Object[] { j.aKM() });
        AppMethodBeat.o(134809);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.j
 * JD-Core Version:    0.6.2
 */