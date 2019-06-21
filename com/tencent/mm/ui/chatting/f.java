package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.uz;
import com.tencent.mm.g.a.uz.b;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class f
{
  private static int yHo = 1;
  private static int yHp = 2;
  private static int yHq = 3;

  public static int a(j.b paramb, boolean paramBoolean)
  {
    int i = 2131231034;
    AppMethodBeat.i(30458);
    f.a locala = e(paramb);
    switch (paramb.fii)
    {
    default:
      AppMethodBeat.o(30458);
      i = 2131231032;
    case 2:
    case 3:
    }
    while (true)
    {
      return i;
      if ((paramBoolean) || (locala.vzW == 1))
        if ((locala.yHr <= 0) || (locala.yHs < 0) || (locala.yHt < 0))
          break;
      switch (locala.yHr)
      {
      default:
        break;
      case 1:
      case 2:
        AppMethodBeat.o(30458);
        break;
      case 3:
        AppMethodBeat.o(30458);
        i = 2131231032;
        break;
      case 4:
        AppMethodBeat.o(30458);
        i = 2131231033;
        continue;
        if (locala.vzW == 2)
        {
          if ((locala.yHr <= 0) || (locala.yHu < 0L))
            break;
          switch (locala.yHr)
          {
          default:
            break;
          case 1:
            AppMethodBeat.o(30458);
            break;
          case 2:
          case 3:
            AppMethodBeat.o(30458);
            i = 2131231032;
            break;
          case 4:
            AppMethodBeat.o(30458);
            i = 2131231033;
            break;
          }
        }
        AppMethodBeat.o(30458);
        i = 2131231032;
      }
    }
  }

  public static String a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(30460);
    Object localObject = ah.getContext();
    ab.d("MicroMsg.C2CAppMsgUtil", "getC2CLuckyMoneyDescByHbStatus() hbType:%s hbStatus:%s receiveStatus:%s isGroupChat:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(paramBoolean2) });
    if (paramInt2 == 5)
    {
      localObject = ((Context)localObject).getString(2131301082);
      AppMethodBeat.o(30460);
    }
    while (true)
    {
      return localObject;
      if (paramInt1 == 1)
      {
        if (paramInt2 == 4)
        {
          if (paramInt3 == 2)
          {
            localObject = ((Context)localObject).getString(2131301083);
            AppMethodBeat.o(30460);
          }
          else
          {
            localObject = ((Context)localObject).getString(2131301081);
            AppMethodBeat.o(30460);
          }
        }
        else if (paramInt2 == 3)
        {
          if (paramInt3 == 2)
          {
            localObject = ((Context)localObject).getString(2131301083);
            AppMethodBeat.o(30460);
            continue;
          }
          localObject = "";
          AppMethodBeat.o(30460);
        }
      }
      else if (paramInt1 == 0)
      {
        if (paramInt2 == 4)
        {
          if (paramBoolean1)
          {
            localObject = ((Context)localObject).getString(2131301081);
            AppMethodBeat.o(30460);
          }
          else if (paramBoolean2)
          {
            if (paramInt3 == 2)
            {
              localObject = ((Context)localObject).getString(2131301083);
              AppMethodBeat.o(30460);
            }
            else
            {
              localObject = ((Context)localObject).getString(2131301081);
              AppMethodBeat.o(30460);
            }
          }
          else
          {
            localObject = ((Context)localObject).getString(2131301083);
            AppMethodBeat.o(30460);
          }
        }
        else if (paramInt2 == 3)
        {
          if (paramBoolean1)
          {
            localObject = "";
            AppMethodBeat.o(30460);
            continue;
          }
          if (paramInt3 == 2)
          {
            localObject = ((Context)localObject).getString(2131301083);
            AppMethodBeat.o(30460);
            continue;
          }
          localObject = "";
          AppMethodBeat.o(30460);
        }
      }
      else if (paramInt2 == 4)
      {
        if ((!paramBoolean2) || ((paramBoolean1) && (paramInt3 == 2)))
        {
          localObject = ((Context)localObject).getString(2131301083);
          AppMethodBeat.o(30460);
        }
        else
        {
          localObject = ((Context)localObject).getString(2131301081);
          AppMethodBeat.o(30460);
        }
      }
      else if (paramInt2 == 3)
      {
        if (paramInt3 == 2)
        {
          if (paramBoolean1)
          {
            localObject = "";
            AppMethodBeat.o(30460);
          }
          else
          {
            localObject = ((Context)localObject).getString(2131301083);
            AppMethodBeat.o(30460);
          }
        }
        else
        {
          localObject = "";
          AppMethodBeat.o(30460);
        }
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(30460);
      }
    }
  }

  public static String b(j.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(30459);
    try
    {
      str1 = r.Yz();
      Object localObject1;
      if (paramb.fii <= 0)
        if (paramBoolean)
        {
          localObject1 = paramb.fhU;
          AppMethodBeat.o(30459);
          paramb = (j.b)localObject1;
        }
      while (true)
      {
        return paramb;
        localObject1 = paramb.fhV;
        AppMethodBeat.o(30459);
        paramb = (j.b)localObject1;
        continue;
        i = 0;
        int j = 0;
        k = -1;
        int m = -1;
        int n = -1;
        i1 = 0;
        l = -1L;
        Object localObject2 = paramb.fih;
        localObject1 = new com/tencent/mm/g/a/uz;
        ((uz)localObject1).<init>();
        ((uz)localObject1).cRN.cRP = ((String)localObject2);
        a.xxA.m((b)localObject1);
        if (paramb.fii != 2)
        {
          i2 = n;
          i3 = m;
          i4 = k;
          if (paramb.fii != 3)
            break label953;
        }
        i5 = n;
        i6 = m;
        i7 = k;
        i8 = j;
        String[] arrayOfString;
        if (!bo.ek(paramb.fim))
        {
          localObject2 = paramb.fim.iterator();
          do
          {
            i5 = n;
            i6 = m;
            i7 = k;
            i8 = j;
            if (!((Iterator)localObject2).hasNext())
              break;
            arrayOfString = ((String)((Iterator)localObject2).next()).split(",");
          }
          while ((arrayOfString.length != 4) || (!arrayOfString[0].equals(str1)));
          i7 = bo.getInt(arrayOfString[1], -1);
          i6 = bo.getInt(arrayOfString[2], -1);
          i5 = bo.getInt(arrayOfString[3], -1);
          i8 = 1;
        }
        i2 = i5;
        i3 = i6;
        i4 = i7;
        i = i8;
        if (bo.ek(paramb.fio))
          break label953;
        localObject2 = paramb.fio.iterator();
        do
        {
          i2 = i5;
          i3 = i6;
          i4 = i7;
          i = i8;
          if (!((Iterator)localObject2).hasNext())
            break;
          arrayOfString = ((String)((Iterator)localObject2).next()).split(",");
        }
        while ((arrayOfString.length != 3) || (!arrayOfString[0].equals(str1)));
        l = bo.getLong(arrayOfString[1], -1L);
        k = bo.getInt(arrayOfString[2], -1);
        i4 = 1;
        i = i8;
        i8 = i4;
        if (((uz)localObject1).cRO.status == yHq)
        {
          localObject1 = ah.getContext().getString(2131296363);
          paramb = (j.b)localObject1;
          AppMethodBeat.o(30459);
        }
        else if (((uz)localObject1).cRO.status == yHp)
        {
          localObject1 = ah.getContext().getString(2131296356);
          paramb = (j.b)localObject1;
          AppMethodBeat.o(30459);
        }
        else
        {
          i4 = paramb.fii;
          switch (i4)
          {
          default:
            if (!paramBoolean)
              break label939;
            paramb = paramb.fhU;
            AppMethodBeat.o(30459);
            break;
          case 1:
            if (!paramBoolean)
              break label556;
            localObject1 = paramb.fhU;
            AppMethodBeat.o(30459);
            paramb = (j.b)localObject1;
          case 2:
          case 3:
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str1;
        int i;
        int k;
        int i1;
        long l;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ab.e("MicroMsg.C2CAppMsgUtil", "getC2CDescFromAppMsgContent, error: %s", new Object[] { localException.getMessage() });
        continue;
        label556: String str2 = paramb.fhV;
        AppMethodBeat.o(30459);
        paramb = str2;
        continue;
        if ((str1.equals(paramb.fir)) || (paramBoolean) || (i != 0))
        {
          if ((i7 <= 0) || (i6 < 0) || (i5 < 0));
        }
        else
          switch (i7)
          {
          default:
            break;
          case 1:
            str2 = ah.getContext().getString(2131296364);
            paramb = str2;
            AppMethodBeat.o(30459);
            break;
          case 2:
            str2 = ah.getContext().getString(2131296362, new Object[] { Integer.valueOf(i6 - i5) });
            paramb = str2;
            AppMethodBeat.o(30459);
            break;
          case 3:
            str2 = ah.getContext().getString(2131296361);
            paramb = str2;
            AppMethodBeat.o(30459);
            break;
          case 4:
            str2 = ah.getContext().getString(2131296363);
            paramb = str2;
            AppMethodBeat.o(30459);
            continue;
            if (i8 != 0)
            {
              if ((k > 0) && (l >= 0L))
                switch (k)
                {
                default:
                  break;
                case 1:
                  str2 = ah.getContext().getString(2131296358, new Object[] { Float.valueOf((float)l / 100.0F) });
                  paramb = str2;
                  AppMethodBeat.o(30459);
                  break;
                case 2:
                  str2 = ah.getContext().getString(2131296357, new Object[] { Float.valueOf((float)l / 100.0F) });
                  paramb = str2;
                  AppMethodBeat.o(30459);
                  break;
                case 3:
                  str2 = ah.getContext().getString(2131296360, new Object[] { Float.valueOf((float)l / 100.0F) });
                  paramb = str2;
                  AppMethodBeat.o(30459);
                  break;
                case 4:
                  str2 = ah.getContext().getString(2131296359);
                  paramb = str2;
                  AppMethodBeat.o(30459);
                  break;
                }
            }
            else
            {
              str2 = ah.getContext().getString(2131296359);
              paramb = str2;
              AppMethodBeat.o(30459);
              continue;
              label939: paramb = paramb.fhV;
              AppMethodBeat.o(30459);
              continue;
              label953: k = -1;
              i8 = i1;
              i5 = i2;
              i6 = i3;
              i7 = i4;
            }
            break;
          }
      }
    }
  }

  public static int c(j.b paramb, boolean paramBoolean)
  {
    int i = 2130837510;
    AppMethodBeat.i(30461);
    if (paramb == null)
      if (paramBoolean)
        AppMethodBeat.o(30461);
    while (true)
    {
      return i;
      AppMethodBeat.o(30461);
      i = 2130837504;
      continue;
      String str = paramb.fih;
      Object localObject = new uz();
      ((uz)localObject).cRN.cRP = str;
      a.xxA.m((b)localObject);
      if ((((uz)localObject).cRO.status == yHq) || (((uz)localObject).cRO.status == yHp))
      {
        if (paramBoolean)
        {
          AppMethodBeat.o(30461);
          i = 2130837515;
        }
        else
        {
          AppMethodBeat.o(30461);
          i = 2130837509;
        }
      }
      else
      {
        localObject = e(paramb);
        switch (paramb.fii)
        {
        default:
        case 2:
        case 3:
        }
        while (true)
          if (paramBoolean)
          {
            AppMethodBeat.o(30461);
            break;
            if ((paramBoolean) || (((f.a)localObject).vzW == 1))
            {
              if ((((f.a)localObject).yHr <= 0) || (((f.a)localObject).yHs < 0) || (((f.a)localObject).yHt < 0));
            }
            else
              switch (((f.a)localObject).yHr)
              {
              default:
                break;
              case 1:
              case 2:
                if (paramBoolean)
                {
                  AppMethodBeat.o(30461);
                  break;
                }
                AppMethodBeat.o(30461);
                i = 2130837504;
                break;
              case 3:
              case 4:
                if (paramBoolean)
                {
                  AppMethodBeat.o(30461);
                  i = 2130837515;
                  break;
                }
                AppMethodBeat.o(30461);
                i = 2130837509;
                break;
                if (((f.a)localObject).vzW == 2)
                {
                  if ((((f.a)localObject).yHr <= 0) || (((f.a)localObject).yHu < 0L))
                    continue;
                  switch (((f.a)localObject).yHr)
                  {
                  default:
                    break;
                  case 1:
                    if (paramBoolean)
                    {
                      AppMethodBeat.o(30461);
                      break;
                    }
                    AppMethodBeat.o(30461);
                    i = 2130837504;
                    break;
                  case 2:
                  case 3:
                  case 4:
                    if (paramBoolean)
                    {
                      AppMethodBeat.o(30461);
                      i = 2130837515;
                      break;
                    }
                    AppMethodBeat.o(30461);
                    i = 2130837509;
                    break;
                  }
                }
                if (paramBoolean)
                {
                  AppMethodBeat.o(30461);
                  break;
                }
                AppMethodBeat.o(30461);
                i = 2130837504;
                break;
              }
          }
        AppMethodBeat.o(30461);
        i = 2130837504;
      }
    }
  }

  public static int d(j.b paramb, boolean paramBoolean)
  {
    int i = -12479656;
    AppMethodBeat.i(30462);
    if (paramb == null)
      AppMethodBeat.o(30462);
    while (true)
    {
      return i;
      String str = paramb.fih;
      Object localObject = new uz();
      ((uz)localObject).cRN.cRP = str;
      a.xxA.m((b)localObject);
      if ((((uz)localObject).cRO.status == yHq) || (((uz)localObject).cRO.status == yHp))
      {
        AppMethodBeat.o(30462);
        i = -8868722;
      }
      else
      {
        localObject = e(paramb);
        switch (paramb.fii)
        {
        default:
        case 2:
        case 3:
        }
        while (true)
        {
          AppMethodBeat.o(30462);
          break;
          if ((paramBoolean) || (((f.a)localObject).vzW == 1))
          {
            if ((((f.a)localObject).yHr <= 0) || (((f.a)localObject).yHs < 0) || (((f.a)localObject).yHt < 0));
          }
          else
            switch (((f.a)localObject).yHr)
            {
            default:
              break;
            case 1:
            case 2:
              AppMethodBeat.o(30462);
              break;
            case 3:
            case 4:
              AppMethodBeat.o(30462);
              i = -8868722;
              break;
              if (((f.a)localObject).vzW != 2)
                break label316;
              if ((((f.a)localObject).yHr > 0) && (((f.a)localObject).yHu >= 0L))
                switch (((f.a)localObject).yHr)
                {
                default:
                case 1:
                case 2:
                case 3:
                case 4:
                }
              break;
            }
        }
        AppMethodBeat.o(30462);
        continue;
        AppMethodBeat.o(30462);
        i = -8868722;
        continue;
        label316: AppMethodBeat.o(30462);
      }
    }
  }

  public static f.a e(j.b paramb)
  {
    AppMethodBeat.i(30457);
    String str = r.Yz();
    Object localObject;
    if ((paramb.fii == 2) || (paramb.fii == 3))
      if (!bo.ek(paramb.fim))
      {
        localObject = paramb.fim.iterator();
        while (((Iterator)localObject).hasNext())
        {
          String[] arrayOfString = ((String)((Iterator)localObject).next()).split(",");
          if ((arrayOfString.length == 4) && (arrayOfString[0].equals(str)))
          {
            paramb = new f.a(bo.getInt(arrayOfString[1], -1), bo.getInt(arrayOfString[2], -1), bo.getInt(arrayOfString[3], -1));
            AppMethodBeat.o(30457);
          }
        }
      }
    while (true)
    {
      return paramb;
      if (!bo.ek(paramb.fio))
      {
        paramb = paramb.fio.iterator();
        while (true)
          if (paramb.hasNext())
          {
            localObject = ((String)paramb.next()).split(",");
            if ((localObject.length == 3) && (localObject[0].equals(str)))
            {
              long l = bo.getLong(localObject[1], -1L);
              paramb = new f.a(bo.getInt(localObject[2], -1), l);
              AppMethodBeat.o(30457);
              break;
            }
          }
      }
      paramb = new f.a();
      AppMethodBeat.o(30457);
    }
  }

  public static int v(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 2130838025;
    if (paramInt1 == 5)
      if (paramBoolean)
        paramInt1 = i;
    while (true)
    {
      return paramInt1;
      paramInt1 = 2130838019;
      continue;
      if (paramInt1 == 4)
      {
        paramInt1 = i;
        if (!paramBoolean)
          paramInt1 = 2130838019;
      }
      else if (paramInt1 == 3)
      {
        if (paramInt2 == 2)
        {
          paramInt1 = i;
          if (!paramBoolean)
            paramInt1 = 2130838019;
        }
        else if (paramBoolean)
        {
          paramInt1 = 2130838020;
        }
        else
        {
          paramInt1 = 2130838014;
        }
      }
      else if (paramBoolean)
      {
        paramInt1 = 2130838020;
      }
      else
      {
        paramInt1 = 2130838014;
      }
    }
  }

  public static int w(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 2130839374;
    int j;
    if (paramInt1 == 5)
      j = i;
    while (true)
    {
      return j;
      j = i;
      if (paramInt1 != 4)
        if (paramInt1 == 3)
        {
          if (paramInt2 == 2)
          {
            j = i;
            if (paramBoolean)
              j = -1;
          }
          else
          {
            j = -1;
          }
        }
        else
          j = -1;
    }
  }

  public static int x(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 2130839410;
    if (paramInt1 == 5)
      if (paramBoolean)
        paramInt1 = i;
    while (true)
    {
      return paramInt1;
      paramInt1 = 2130839295;
      continue;
      if (paramInt1 == 4)
      {
        paramInt1 = i;
        if (!paramBoolean)
          paramInt1 = 2130839295;
      }
      else if (paramInt1 == 3)
      {
        if (paramInt2 == 2)
        {
          paramInt1 = i;
          if (!paramBoolean)
            paramInt1 = 2130839295;
        }
        else if (paramBoolean)
        {
          paramInt1 = 2130839409;
        }
        else
        {
          paramInt1 = 2130839294;
        }
      }
      else if (paramBoolean)
      {
        paramInt1 = 2130839409;
      }
      else
      {
        paramInt1 = 2130839294;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f
 * JD-Core Version:    0.6.2
 */