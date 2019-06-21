package com.tencent.mm.emoji.a;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.sync.EmojiUpdateReceiver;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static a eyu;
  public ArrayList<EmojiGroupInfo> eyA;
  public HashMap<String, ArrayList<EmojiInfo>> eyB;
  private boolean eyv;
  private boolean eyw;
  public boolean eyx;
  private boolean eyy;
  private boolean eyz;

  private a()
  {
    AppMethodBeat.i(62231);
    this.eyv = true;
    this.eyw = true;
    this.eyx = true;
    this.eyy = true;
    this.eyz = true;
    this.eyA = new ArrayList();
    this.eyB = new HashMap();
    AppMethodBeat.o(62231);
  }

  public static a OB()
  {
    try
    {
      AppMethodBeat.i(62230);
      if (eyu == null)
      {
        locala = new com/tencent/mm/emoji/a/a;
        locala.<init>();
        eyu = locala;
      }
      a locala = eyu;
      AppMethodBeat.o(62230);
      return locala;
    }
    finally
    {
    }
  }

  public final ArrayList<EmojiInfo> OC()
  {
    AppMethodBeat.i(62233);
    if ((!this.eyB.containsKey("download_custom")) || (this.eyv))
    {
      if (((h)g.RM().Rn()).SG())
      {
        localObject = (ArrayList)at.dsZ().xYn.ps(true);
        this.eyB.put("download_custom", localObject);
      }
    }
    else
    {
      this.eyv = false;
      localObject = (ArrayList)this.eyB.get("download_custom");
      AppMethodBeat.o(62233);
      return localObject;
    }
    Object localObject = new UnsupportedOperationException("need get from main process");
    AppMethodBeat.o(62233);
    throw ((Throwable)localObject);
  }

  public final ArrayList<EmojiGroupInfo> OD()
  {
    AppMethodBeat.i(62235);
    if (this.eyy)
      if (!((h)g.RM().Rn()).SG())
        break label57;
    ArrayList localArrayList;
    for (this.eyA = at.dsZ().xYo.duG(); ; this.eyA = localArrayList)
    {
      this.eyy = false;
      localArrayList = this.eyA;
      AppMethodBeat.o(62235);
      return localArrayList;
      label57: localArrayList = new ArrayList();
      Object localObject = com.tencent.mm.by.a.call(com.tencent.mm.by.a.getUri(), "getEmojiGroupInfoList", null, null);
      if (localObject != null)
      {
        ((Bundle)localObject).setClassLoader(EmojiGroupInfo.class.getClassLoader());
        if (((Bundle)localObject).containsKey("data"))
        {
          localObject = ((Bundle)localObject).getParcelableArrayList("data");
          if (localObject != null)
          {
            localArrayList.addAll((Collection)localObject);
            ab.i("MicroMsg.EmojiStorageCache", "[getEmojiGroupInfoListExport] size: %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
          }
        }
      }
    }
  }

  public final ArrayList<EmojiInfo> bY(boolean paramBoolean)
  {
    AppMethodBeat.i(62232);
    ab.d("MicroMsg.EmojiStorageCache", "onlySuccessEmoji: %s.", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject1;
    Object localObject2;
    if ((!this.eyB.containsKey("custom")) || (this.eyw))
    {
      ab.i("MicroMsg.EmojiStorageCache", "getAllCustomEmoji: %s", new Object[] { Boolean.valueOf(this.eyw) });
      if (!((h)g.RM().Rn()).SG())
        break label219;
      localObject1 = at.dsZ().xYn;
      localObject2 = new ArrayList();
      ((List)localObject2).addAll(((com.tencent.mm.storage.emotion.d)localObject1).My(EmojiGroupInfo.yae));
      ((List)localObject2).addAll(((com.tencent.mm.storage.emotion.d)localObject1).My(EmojiGroupInfo.yad));
      localObject2 = (ArrayList)localObject2;
    }
    Object localObject3;
    while (true)
    {
      this.eyB.put("custom", localObject2);
      this.eyw = false;
      localObject1 = (ArrayList)this.eyB.get("custom");
      if ((localObject1 == null) || (!paramBoolean))
        break label327;
      localObject3 = new ArrayList();
      localObject2 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        EmojiInfo localEmojiInfo = (EmojiInfo)((Iterator)localObject2).next();
        if (EmojiInfo.a.yaC != localEmojiInfo.duZ())
          ((ArrayList)localObject3).add(localEmojiInfo);
      }
      label219: localObject1 = new ArrayList();
      localObject3 = com.tencent.mm.by.a.call(com.tencent.mm.by.a.getUri(), "getAllCustomEmoji", null, null);
      localObject2 = localObject1;
      if (localObject3 != null)
      {
        ((Bundle)localObject3).setClassLoader(EmojiInfo.class.getClassLoader());
        localObject2 = localObject1;
        if (((Bundle)localObject3).containsKey("data"))
        {
          localObject3 = ((Bundle)localObject3).getParcelableArrayList("data");
          localObject2 = localObject1;
          if (localObject3 != null)
          {
            ((ArrayList)localObject1).addAll((Collection)localObject3);
            ab.i("MicroMsg.EmojiStorageCache", "[getAllCustomEmojiExport] size:%s", new Object[] { Integer.valueOf(((List)localObject3).size()) });
            localObject2 = localObject1;
          }
        }
      }
    }
    ((ArrayList)localObject1).removeAll((Collection)localObject3);
    label327: AppMethodBeat.o(62232);
    return localObject1;
  }

  public final ArrayList<EmojiInfo> bZ(boolean paramBoolean)
  {
    AppMethodBeat.i(62236);
    ab.i("MicroMsg.EmojiStorageCache", "getCaptureEmoji: needUpdateCaptureEmoji %s withFailed %s.", new Object[] { Boolean.valueOf(this.eyz), Boolean.valueOf(paramBoolean) });
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i;
    if ((!this.eyB.containsKey("capture")) || (this.eyz))
    {
      if (((h)g.RM().Rn()).SG())
      {
        localObject1 = at.dsZ().xYn;
        localObject2 = new ArrayList();
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("select * from EmojiInfo where groupId = \"capture\"");
        ((StringBuilder)localObject3).append(" and state != ").append(EmojiInfo.yau);
        ((StringBuilder)localObject3).append(" order by idx asc ");
        localObject1 = ((com.tencent.mm.storage.emotion.d)localObject1).bSd.rawQuery(((StringBuilder)localObject3).toString(), null);
        if (localObject1 != null)
        {
          if (((Cursor)localObject1).moveToFirst())
            do
            {
              localObject3 = new EmojiInfo();
              ((EmojiInfo)localObject3).d((Cursor)localObject1);
              ((List)localObject2).add(localObject3);
            }
            while (((Cursor)localObject1).moveToNext());
          ((Cursor)localObject1).close();
        }
        localObject2 = (ArrayList)localObject2;
        ab.i("MicroMsg.EmojiStorageCache", "getCaptureEmoji: %s size %s", new Object[] { Boolean.valueOf(this.eyz), Integer.valueOf(((ArrayList)localObject2).size()) });
        this.eyB.put("capture", localObject2);
      }
    }
    else
    {
      this.eyz = false;
      localObject3 = (ArrayList)this.eyB.get("capture");
      if (!paramBoolean)
        break label419;
      if (localObject3 != null)
        break label409;
      i = 0;
      label276: ab.d("MicroMsg.EmojiStorageCache", "getCaptureEmoji list size: %s.", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(62236);
      localObject2 = localObject3;
    }
    while (true)
    {
      return localObject2;
      localObject3 = new ArrayList();
      localObject1 = com.tencent.mm.by.a.call(com.tencent.mm.by.a.getUri(), "getCaptureEmoji", null, null);
      localObject2 = localObject3;
      if (localObject1 == null)
        break;
      ((Bundle)localObject1).setClassLoader(EmojiInfo.class.getClassLoader());
      localObject2 = localObject3;
      if (!((Bundle)localObject1).containsKey("key_data"))
        break;
      localObject1 = ((Bundle)localObject1).getParcelableArrayList("key_data");
      localObject2 = localObject3;
      if (localObject1 == null)
        break;
      ((ArrayList)localObject3).addAll((Collection)localObject1);
      ab.i("MicroMsg.EmojiStorageCache", "[getCaptureEmojiExport] size:%s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
      localObject2 = localObject3;
      break;
      label409: i = ((ArrayList)localObject3).size();
      break label276;
      label419: localObject2 = new ArrayList();
      if (localObject3 != null)
      {
        localObject3 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject1 = (EmojiInfo)((Iterator)localObject3).next();
          if (((EmojiInfo)localObject1).duZ() == EmojiInfo.a.yaC)
            ((ArrayList)localObject2).add(localObject1);
        }
      }
      ab.d("MicroMsg.EmojiStorageCache", "getCaptureEmoji result size: %s.", new Object[] { Integer.valueOf(((ArrayList)localObject2).size()) });
      AppMethodBeat.o(62236);
    }
  }

  public final void ca(boolean paramBoolean)
  {
    AppMethodBeat.i(62237);
    this.eyw = true;
    ab.i("MicroMsg.EmojiStorageCache", "setNeedUpdateAllCustomEmoji %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      Intent localIntent = new Intent();
      localIntent.setAction(EmojiUpdateReceiver.ACTION);
      localIntent.putExtra(EmojiUpdateReceiver.ezN, EmojiUpdateReceiver.ezO);
      ah.getContext().sendBroadcast(localIntent);
    }
    AppMethodBeat.o(62237);
  }

  public final void cb(boolean paramBoolean)
  {
    AppMethodBeat.i(62238);
    this.eyv = true;
    ab.i("MicroMsg.EmojiStorageCache", "setNeedUpdateAllCustomEmoji %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      Intent localIntent = new Intent();
      localIntent.setAction(EmojiUpdateReceiver.ACTION);
      localIntent.putExtra(EmojiUpdateReceiver.ezN, EmojiUpdateReceiver.ezP);
      ah.getContext().sendBroadcast(localIntent);
    }
    AppMethodBeat.o(62238);
  }

  public final void cc(boolean paramBoolean)
  {
    AppMethodBeat.i(62239);
    this.eyy = true;
    ab.i("MicroMsg.EmojiStorageCache", "setNeedUpdateGroupInfo: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      Intent localIntent = new Intent();
      localIntent.setAction(EmojiUpdateReceiver.ACTION);
      localIntent.putExtra(EmojiUpdateReceiver.ezN, EmojiUpdateReceiver.ezR);
      ah.getContext().sendBroadcast(localIntent);
    }
    AppMethodBeat.o(62239);
  }

  public final void cd(boolean paramBoolean)
  {
    AppMethodBeat.i(62240);
    this.eyz = true;
    if (paramBoolean)
    {
      String str = EmojiUpdateReceiver.ezS;
      Intent localIntent = new Intent();
      localIntent.setAction(EmojiUpdateReceiver.ACTION);
      localIntent.putExtra(EmojiUpdateReceiver.ezN, str);
      ah.getContext().sendBroadcast(localIntent);
    }
    AppMethodBeat.o(62240);
  }

  public final ArrayList<EmojiInfo> kS(String paramString)
  {
    AppMethodBeat.i(62234);
    if (this.eyx)
    {
      this.eyB.clear();
      this.eyx = false;
    }
    Object localObject1;
    if (!this.eyB.containsKey(paramString))
    {
      if (!((h)g.RM().Rn()).SG())
        break label95;
      localObject1 = (ArrayList)at.dsZ().xYn.Jg(paramString);
    }
    while (true)
    {
      this.eyB.put(paramString, localObject1);
      paramString = (ArrayList)this.eyB.get(paramString);
      AppMethodBeat.o(62234);
      return paramString;
      label95: ArrayList localArrayList = new ArrayList();
      Object localObject2 = com.tencent.mm.by.a.call(com.tencent.mm.by.a.getUri(), "getEmojiListByGroupId", String.valueOf(paramString), null);
      localObject1 = localArrayList;
      if (localObject2 != null)
      {
        ((Bundle)localObject2).setClassLoader(EmojiInfo.class.getClassLoader());
        localObject1 = localArrayList;
        if (((Bundle)localObject2).containsKey("data"))
        {
          localObject2 = ((Bundle)localObject2).getParcelableArrayList("data");
          localObject1 = localArrayList;
          if (localObject2 != null)
          {
            localArrayList.addAll((Collection)localObject2);
            ab.i("MicroMsg.EmojiStorageCache", "[getEmojiListByGroupIdExport] size%s", new Object[] { Integer.valueOf(((List)localObject2).size()) });
            localObject1 = localArrayList;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.a.a
 * JD-Core Version:    0.6.2
 */