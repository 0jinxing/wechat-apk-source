package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i$a
{
  public String desc;
  public String mjO;
  public String thumbPath;
  public String title;

  private static boolean Mc(String paramString)
  {
    AppMethodBeat.i(74126);
    boolean bool = new com.tencent.mm.vfs.b(paramString).exists();
    AppMethodBeat.o(74126);
    return bool;
  }

  public static a a(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74127);
    int j;
    Object localObject3;
    Object localObject4;
    if (paramg.field_type == 18)
    {
      locala = new a();
      localObject1 = new SparseIntArray();
      if (paramg.field_type == 18)
        locala.title = paramg.field_favProto.title;
      i = 0;
      localLinkedList = new LinkedList();
      localObject2 = paramg.field_favProto.wiv.iterator();
      j = 0;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (aar)((Iterator)localObject2).next();
        if ((paramg.field_type != 18) || (bo.isNullOrNil(((aar)localObject3).wgo)) || (!((aar)localObject3).wgo.equals(".htm")))
        {
          int k = ((SparseIntArray)localObject1).get(((aar)localObject3).dataType);
          ((SparseIntArray)localObject1).put(((aar)localObject3).dataType, k + 1);
          switch (((aar)localObject3).dataType)
          {
          case 5:
          case 7:
          case 9:
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:
          case 18:
          default:
            break;
          case 1:
            if (localLinkedList.size() < 4)
            {
              localObject3 = ((aar)localObject3).desc;
              if (!bo.isNullOrNil((String)localObject3))
              {
                localObject3 = ((String)localObject3).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
                localLinkedList.add((String)localObject3 + "\n");
              }
            }
            break;
          case 3:
            if (localLinkedList.size() < 4)
            {
              k = (int)com.tencent.mm.plugin.fav.a.b.iu(((aar)localObject3).duration);
              localLinkedList.add(paramContext.getString(2131297079) + paramContext.getString(2131299584, new Object[] { Integer.valueOf(k) }) + "\n");
            }
            break;
          case 2:
            if (j == 0)
            {
              localObject4 = com.tencent.mm.plugin.fav.a.b.c((aar)localObject3);
              if (Mc((String)localObject4))
              {
                locala.thumbPath = ((String)localObject4);
                j = 1;
              }
              else
              {
                locala.thumbPath = com.tencent.mm.plugin.fav.a.b.b((aar)localObject3);
                j = 1;
              }
            }
            break;
          case 6:
            if (localLinkedList.size() < 4)
            {
              localObject3 = ((aar)localObject3).wgT.why;
              localObject4 = new StringBuilder().append(paramContext.getString(2131296967));
              if ((!bo.isNullOrNil(((aay)localObject3).cIK)) && (!((aay)localObject3).cIK.equals(paramContext.getString(2131300997))))
                break label564;
            }
            for (localObject3 = ((aay)localObject3).label; ; localObject3 = ((aay)localObject3).cIK)
            {
              localLinkedList.add((String)localObject3 + "\n");
              if (i != 0)
                break;
              i = 1;
              break;
            }
          case 8:
            if (localLinkedList.size() < 4)
              localLinkedList.add(paramContext.getString(2131296942) + ((aar)localObject3).title + "\n");
            if (i == 0)
              i = 1;
            break;
          case 4:
            if (localLinkedList.size() < 4)
              localLinkedList.add(paramContext.getString(2131297076) + "\n");
            break;
          case 17:
            if (localLinkedList.size() < 4)
              localLinkedList.add(paramContext.getString(2131297030) + "\n");
            break;
          case 19:
            label564: if (localLinkedList.size() < 4)
              localLinkedList.add(paramContext.getString(2131296528) + ((aar)localObject3).title + "\n");
            break;
          }
        }
      }
      locala.desc = "";
      paramg = localLinkedList.iterator();
      for (paramContext = ""; paramg.hasNext(); paramContext = paramContext + (String)localObject3)
        localObject3 = (String)paramg.next();
      paramg = paramContext.trim();
      paramContext = paramg;
      if (localLinkedList.size() >= 4)
        paramContext = paramg + "...";
      locala.desc = paramContext;
      if (locala.title == null)
        locala.title = "";
      AppMethodBeat.o(74127);
      paramContext = locala;
      return paramContext;
    }
    a locala = new a();
    Object localObject2 = new SparseIntArray();
    if (paramg.field_type == 14)
      locala.title = paramg.field_favProto.title;
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = paramg.field_favProto.wiv.iterator();
    int i = 0;
    label969: 
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = (aar)((Iterator)localObject1).next();
      j = ((SparseIntArray)localObject2).get(((aar)localObject4).dataType);
      ((SparseIntArray)localObject2).put(((aar)localObject4).dataType, j + 1);
      switch (((aar)localObject4).dataType)
      {
      case 9:
      case 12:
      case 13:
      case 18:
      default:
        break;
      case 1:
        if (localLinkedList.size() < 4)
          localLinkedList.add(((aar)localObject4).wgV + ":" + ((aar)localObject4).desc + "\n");
        break;
      case 3:
        if (localLinkedList.size() < 4)
        {
          j = (int)com.tencent.mm.plugin.fav.a.b.fY(((aar)localObject4).duration);
          localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131297079) + paramContext.getString(2131299584, new Object[] { Integer.valueOf(j) }) + "\n");
        }
        break;
      case 2:
        if (localLinkedList.size() < 4)
          localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131297012) + "\n");
        if (i == 0)
        {
          paramg = com.tencent.mm.plugin.fav.a.b.c((aar)localObject4);
          if (!Mc(paramg))
            break label2559;
          locala.thumbPath = paramg;
          i = 1;
        }
        break;
      case 5:
      case 15:
      case 4:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 14:
      case 16:
      case 17:
      case 19:
      }
    }
    label1783: label2559: 
    while (true)
    {
      break label969;
      if (localLinkedList.size() < 4)
        localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131297071) + ((aar)localObject4).title + "\n");
      if (i != 0)
        break label969;
      paramg = com.tencent.mm.plugin.fav.a.b.c((aar)localObject4);
      if (Mc(paramg))
      {
        locala.thumbPath = paramg;
        i = 1;
        break label969;
      }
      paramg = ((aar)localObject4).wgT.whA;
      if (paramg == null);
      for (paramg = ""; ; paramg = paramg.thumbUrl)
      {
        localObject3 = paramg;
        if (bo.isNullOrNil(paramg))
          localObject3 = bo.bc(((aar)localObject4).cvq, "");
        a(locala, (String)localObject3);
        break;
      }
      if (localLinkedList.size() < 4)
        localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131297051) + "\n");
      if (i != 0)
        break label969;
      paramg = com.tencent.mm.plugin.fav.a.b.c((aar)localObject4);
      if (Mc(paramg))
      {
        locala.thumbPath = paramg;
        i = 1;
      }
      while (true)
      {
        break label969;
        if (localLinkedList.size() < 4)
          localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131297076) + "\n");
        if (i != 0)
          break label969;
        paramg = com.tencent.mm.plugin.fav.a.b.c((aar)localObject4);
        if (Mc(paramg))
        {
          locala.thumbPath = paramg;
          i = 1;
        }
        while (true)
        {
          break label969;
          if (localLinkedList.size() < 4)
          {
            paramg = ((aar)localObject4).wgT.why;
            localObject3 = new StringBuilder().append(((aar)localObject4).wgV).append(":").append(paramContext.getString(2131296967));
            if ((!bo.isNullOrNil(paramg.cIK)) && (!paramg.cIK.equals(paramContext.getString(2131300997))))
              break label1783;
          }
          for (paramg = paramg.label; ; paramg = paramg.cIK)
          {
            localLinkedList.add(paramg + "\n");
            if (i != 0)
              break;
            i = 1;
            break;
          }
          if (localLinkedList.size() < 4)
            localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131296980) + ((aar)localObject4).title + "\n");
          if (i != 0)
            break label969;
          a(locala, ((aar)localObject4).cvq);
          i = 1;
          break label969;
          if (localLinkedList.size() < 4)
            localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131296942) + ((aar)localObject4).title + "\n");
          if (i != 0)
            break label969;
          i = 1;
          break label969;
          if (localLinkedList.size() < 4)
            localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131297017) + ((aar)localObject4).wgT.whC.title + "\n");
          if (i != 0)
            break label969;
          paramg = ((aar)localObject4).wgT.whC;
          if (paramg != null)
            a(locala, paramg.thumbUrl);
          i = 1;
          break label969;
          if (localLinkedList.size() < 4)
            localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131296527) + "\n");
          if (i != 0)
            break label969;
          paramg = ((aar)localObject4).wgT.whE;
          if (paramg != null)
            a(locala, paramg.thumbUrl);
          i = 1;
          break label969;
          if (localLinkedList.size() < 4)
            localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131296947) + "\n");
          if (i != 0)
            break label969;
          locala.mjO = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Rn(((aar)localObject4).desc).svN;
          i = 1;
          break label969;
          if (localLinkedList.size() >= 4)
            break label969;
          localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131297030) + "\n");
          break label969;
          if (localLinkedList.size() >= 4)
            break label969;
          if ((((aar)localObject4).wgT.whN != null) && (((aar)localObject4).wgT.whN.type == 3))
          {
            localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131296992) + "\n");
            break label969;
          }
          localLinkedList.add(((aar)localObject4).wgV + ":" + paramContext.getString(2131296528) + ((aar)localObject4).title + "\n");
          break label969;
          locala.desc = "";
          paramg = localLinkedList.iterator();
          for (paramContext = ""; paramg.hasNext(); paramContext = paramContext + (String)localObject3)
            localObject3 = (String)paramg.next();
          paramg = paramContext.trim();
          paramContext = paramg;
          if (localLinkedList.size() >= 4)
            paramContext = paramg + "...";
          locala.desc = paramContext;
          AppMethodBeat.o(74127);
          paramContext = locala;
          break;
        }
      }
    }
  }

  private static void a(a parama, String paramString)
  {
    AppMethodBeat.i(74128);
    paramString = com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(bo.bc(paramString, "").getBytes());
    if (Mc(paramString))
      parama.thumbPath = paramString;
    AppMethodBeat.o(74128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.i.a
 * JD-Core Version:    0.6.2
 */