package android.support.constraint.a.a;

import android.support.constraint.a.a;
import android.support.constraint.a.b;
import android.support.constraint.a.h;
import java.util.ArrayList;

final class c
{
  static void a(g paramg, android.support.constraint.a.e parame, int paramInt)
  {
    int i;
    d[] arrayOfd;
    int j;
    int k;
    Object localObject1;
    f localf1;
    f localf2;
    Object localObject2;
    f localf3;
    Object localObject3;
    int m;
    float f1;
    int n;
    label133: int i1;
    label148: int i2;
    label160: int i3;
    label172: int i4;
    Object localObject4;
    int i5;
    if (paramInt == 0)
    {
      i = paramg.jB;
      arrayOfd = paramg.jE;
      j = 0;
      k = 0;
      if (k >= i)
        break label2797;
      localObject1 = arrayOfd[k];
      if (!((d)localObject1).hu)
        ((d)localObject1).aF();
      ((d)localObject1).hu = true;
      if ((paramg.z(4)) && (k.a(parame, paramInt, j, (d)localObject1)))
        break label1667;
      localf1 = ((d)localObject1).hf;
      localf2 = ((d)localObject1).hh;
      localObject2 = ((d)localObject1).hg;
      localf3 = ((d)localObject1).hi;
      localObject3 = ((d)localObject1).hj;
      m = 0;
      f1 = ((d)localObject1).hp;
      if (paramg.iF[paramInt] != f.a.jr)
        break label524;
      n = 1;
      if (paramInt != 0)
        break label548;
      if (((f)localObject3).jg != 0)
        break label530;
      i1 = 1;
      if (((f)localObject3).jg != 1)
        break label536;
      i2 = 1;
      if (((f)localObject3).jg != 2)
        break label542;
      i3 = 1;
      i4 = i3;
      localObject4 = localf1;
      i3 = i1;
      i5 = i2;
    }
    label188: Object localObject5;
    while (true)
    {
      if (m != 0)
        break label680;
      localObject5 = localObject4.iD[j];
      i1 = 4;
      if ((n != 0) || (i4 != 0))
        i1 = 1;
      i2 = ((e)localObject5).aH();
      int i6 = i2;
      if (((e)localObject5).hy != null)
      {
        i6 = i2;
        if (localObject4 != localf1)
          i6 = i2 + ((e)localObject5).hy.aH();
      }
      if ((i4 != 0) && (localObject4 != localf1) && (localObject4 != localObject2))
      {
        i2 = 6;
        label285: if (((e)localObject5).hy != null)
        {
          if (localObject4 != localObject2)
            break label644;
          parame.a(((e)localObject5).hE, ((e)localObject5).hy.hE, i6, 5);
          label320: parame.c(((e)localObject5).hE, ((e)localObject5).hy.hE, i6, i2);
        }
        if (n != 0)
        {
          if ((((f)localObject4).iZ != 8) && (localObject4.iF[paramInt] == f.a.js))
            parame.a(localObject4.iD[(j + 1)].hE, localObject4.iD[j].hE, 0, 5);
          parame.a(localObject4.iD[j].hE, paramg.iD[j].hE, 0, 6);
        }
        localObject5 = localObject4.iD[(j + 1)].hy;
        if (localObject5 == null)
          break label668;
        localObject6 = ((e)localObject5).hw;
        if (localObject6.iD[j].hy != null)
        {
          localObject5 = localObject6;
          if (localObject6.iD[j].hy.hw == localObject4)
            break label495;
        }
      }
      label524: label530: label536: label668: for (localObject5 = null; ; localObject5 = null)
      {
        label495: if (localObject5 == null)
          break label674;
        localObject4 = localObject5;
        break label188;
        i = paramg.jC;
        arrayOfd = paramg.jD;
        j = 2;
        break;
        n = 0;
        break label133;
        i1 = 0;
        break label148;
        i2 = 0;
        break label160;
        label542: i3 = 0;
        break label172;
        label548: if (((f)localObject3).jh == 0)
        {
          i1 = 1;
          label559: if (((f)localObject3).jh != 1)
            break label608;
          i2 = 1;
          label571: if (((f)localObject3).jh != 2)
            break label614;
        }
        label608: label614: for (i3 = 1; ; i3 = 0)
        {
          localObject4 = localf1;
          i4 = i3;
          i5 = i2;
          i3 = i1;
          break;
          i1 = 0;
          break label559;
          i2 = 0;
          break label571;
        }
        i2 = i1;
        if (i3 == 0)
          break label285;
        i2 = i1;
        if (n == 0)
          break label285;
        i2 = 4;
        break label285;
        parame.a(((e)localObject5).hE, ((e)localObject5).hy.hE, i6, 6);
        break label320;
      }
      label644: label674: m = 1;
    }
    label680: if ((localf3 != null) && (localf2.iD[(j + 1)].hy != null))
    {
      localObject5 = localf3.iD[(j + 1)];
      parame.b(((e)localObject5).hE, localf2.iD[(j + 1)].hy.hE, -((e)localObject5).aH(), 5);
    }
    if (n != 0)
      parame.a(paramg.iD[(j + 1)].hE, localf2.iD[(j + 1)].hE, localf2.iD[(j + 1)].aH(), 6);
    Object localObject6 = ((d)localObject1).hm;
    float f2;
    if (localObject6 != null)
    {
      i2 = ((ArrayList)localObject6).size();
      if (i2 > 1)
      {
        localObject5 = null;
        f2 = 0.0F;
        if ((!((d)localObject1).hr) || (((d)localObject1).ht))
          break label2836;
        f1 = ((d)localObject1).ho;
      }
    }
    label1667: label1679: label2836: 
    while (true)
    {
      i1 = 0;
      float f4;
      label993: Object localObject7;
      h localh;
      Object localObject8;
      Object localObject9;
      if (i1 < i2)
      {
        localObject4 = (f)((ArrayList)localObject6).get(i1);
        float f3 = localObject4.jk[paramInt];
        f4 = f3;
        if (f3 < 0.0F)
          if (((d)localObject1).ht)
            parame.c(localObject4.iD[(j + 1)].hE, localObject4.iD[j].hE, 0, 4);
        for (f4 = f2; ; f4 = f2)
        {
          i1++;
          f2 = f4;
          break;
          f4 = 1.0F;
          if (f4 != 0.0F)
            break label993;
          parame.c(localObject4.iD[(j + 1)].hE, localObject4.iD[j].hE, 0, 6);
        }
        if (localObject5 != null)
        {
          localObject7 = localObject5.iD[j].hE;
          localObject5 = localObject5.iD[(j + 1)].hE;
          localh = localObject4.iD[j].hE;
          localObject8 = localObject4.iD[(j + 1)].hE;
          localObject9 = parame.ax();
          ((b)localObject9).fG = 0.0F;
          if ((f1 != 0.0F) && (f2 != f4))
            break label1140;
          ((b)localObject9).fI.a((h)localObject7, 1.0F);
          ((b)localObject9).fI.a((h)localObject5, -1.0F);
          ((b)localObject9).fI.a((h)localObject8, 1.0F);
          ((b)localObject9).fI.a(localh, -1.0F);
        }
        while (true)
        {
          parame.b((b)localObject9);
          localObject5 = localObject4;
          break;
          label1140: if (f2 == 0.0F)
          {
            ((b)localObject9).fI.a((h)localObject7, 1.0F);
            ((b)localObject9).fI.a((h)localObject5, -1.0F);
          }
          else if (f4 == 0.0F)
          {
            ((b)localObject9).fI.a(localh, 1.0F);
            ((b)localObject9).fI.a((h)localObject8, -1.0F);
          }
          else
          {
            f2 = f2 / f1 / (f4 / f1);
            ((b)localObject9).fI.a((h)localObject7, 1.0F);
            ((b)localObject9).fI.a((h)localObject5, -1.0F);
            ((b)localObject9).fI.a((h)localObject8, f2);
            ((b)localObject9).fI.a(localh, -f2);
          }
        }
      }
      if ((localObject2 != null) && ((localObject2 == localf3) || (i4 != 0)))
      {
        localObject6 = localf1.iD[j];
        localObject1 = localf2.iD[(j + 1)];
        if (localf1.iD[j].hy != null)
        {
          localObject5 = localf1.iD[j].hy.hE;
          label1339: if (localf2.iD[(j + 1)].hy == null)
            break label1679;
          localObject4 = localf2.iD[(j + 1)].hy.hE;
          label1373: if (localObject2 == localf3)
          {
            localObject6 = localObject2.iD[j];
            localObject1 = localObject2.iD[(j + 1)];
          }
          if ((localObject5 != null) && (localObject4 != null))
            if (paramInt != 0)
              break label1685;
        }
        label1685: for (f4 = ((f)localObject3).iV; ; f4 = ((f)localObject3).iW)
        {
          i2 = ((e)localObject6).aH();
          i1 = ((e)localObject1).aH();
          parame.a(((e)localObject6).hE, (h)localObject5, i2, f4, (h)localObject4, ((e)localObject1).hE, i1, 5);
          if (((i3 != 0) || (i5 != 0)) && (localObject2 != null))
          {
            localObject6 = localObject2.iD[j];
            localObject1 = localf3.iD[(j + 1)];
            if (((e)localObject6).hy == null)
              break label2779;
            localObject4 = ((e)localObject6).hy.hE;
            label1517: if (((e)localObject1).hy == null)
              break label2785;
            localObject5 = ((e)localObject1).hy.hE;
            label1535: if (localf2 != localf3)
            {
              localObject5 = localf2.iD[(j + 1)];
              if (((e)localObject5).hy == null)
                break label2791;
              localObject5 = ((e)localObject5).hy.hE;
            }
            label1572: if (localObject2 != localf3)
              break label2805;
            localObject6 = localObject2.iD[j];
            localObject2 = localObject2.iD[(j + 1)];
            label1601: if ((localObject4 != null) && (localObject5 != null))
            {
              i1 = ((e)localObject6).aH();
              if (localf3 != null)
                break label2798;
              localObject1 = localf2;
              label1627: i2 = localObject1.iD[(j + 1)].aH();
              parame.a(((e)localObject6).hE, (h)localObject4, i1, 0.5F, (h)localObject5, ((e)localObject2).hE, i2, 5);
            }
          }
          k++;
          break;
          localObject5 = null;
          break label1339;
          localObject4 = null;
          break label1373;
        }
      }
      if ((i3 != 0) && (localObject2 != null))
      {
        if ((((d)localObject1).ho > 0) && (((d)localObject1).hn == ((d)localObject1).ho));
        for (n = 1; ; n = 0)
        {
          localObject1 = localObject2;
          localObject6 = localObject2;
          label1737: if (localObject6 == null)
            break label2082;
          for (localObject4 = localObject6.jm[paramInt]; (localObject4 != null) && (((f)localObject4).iZ == 8); localObject4 = localObject4.jm[paramInt]);
        }
        if ((localObject4 != null) || (localObject6 == localf3))
        {
          localObject7 = localObject6.iD[j];
          localh = ((e)localObject7).hE;
          if (((e)localObject7).hy == null)
            break label2084;
          localObject5 = ((e)localObject7).hy.hE;
          label1831: if (localObject1 == localObject6)
            break label2090;
          localObject5 = localObject1.iD[(j + 1)].hE;
          label1853: localObject3 = localObject5;
          label1857: localObject5 = null;
          i4 = ((e)localObject7).aH();
          i2 = localObject6.iD[(j + 1)].aH();
          if (localObject4 == null)
            break label2151;
          localObject7 = localObject4.iD[j];
          localObject5 = ((e)localObject7).hE;
          label1904: localObject8 = localObject6.iD[(j + 1)].hE;
          i1 = i2;
          if (localObject7 != null)
            i1 = i2 + ((e)localObject7).aH();
          i2 = i4;
          if (localObject1 != null)
            i2 = i4 + localObject1.iD[(j + 1)].aH();
          if ((localh != null) && (localObject3 != null) && (localObject5 != null) && (localObject8 != null))
          {
            if (localObject6 == localObject2)
              i2 = localObject2.iD[j].aH();
            if (localObject6 == localf3)
              i1 = localf3.iD[(j + 1)].aH();
            i4 = 4;
            if (n != 0)
              i4 = 6;
            parame.a(localh, (h)localObject3, i2, 0.5F, (h)localObject5, (h)localObject8, i1, i4);
          }
        }
        if (((f)localObject6).iZ == 8)
          break label2829;
      }
      for (localObject5 = localObject6; ; localObject5 = localObject1)
      {
        localObject6 = localObject4;
        localObject1 = localObject5;
        break label1737;
        label2082: break;
        label2084: localObject5 = null;
        break label1831;
        label2090: localObject3 = localObject5;
        if (localObject6 != localObject2)
          break label1857;
        localObject3 = localObject5;
        if (localObject1 != localObject6)
          break label1857;
        if (localf1.iD[j].hy != null)
        {
          localObject5 = localf1.iD[j].hy.hE;
          break label1853;
        }
        localObject5 = null;
        break label1853;
        label2151: localObject8 = localf2.iD[(j + 1)].hy;
        localObject7 = localObject8;
        if (localObject8 == null)
          break label1904;
        localObject5 = ((e)localObject8).hE;
        localObject7 = localObject8;
        break label1904;
        if ((i5 == 0) || (localObject2 == null))
          break;
        if ((((d)localObject1).ho > 0) && (((d)localObject1).hn == ((d)localObject1).ho));
        for (i1 = 1; ; i1 = 0)
        {
          localObject4 = localObject2;
          localObject6 = localObject2;
          label2231: if (localObject6 == null)
            break label2614;
          for (localObject5 = localObject6.jm[paramInt]; (localObject5 != null) && (((f)localObject5).iZ == 8); localObject5 = localObject5.jm[paramInt]);
        }
        if ((localObject6 != localObject2) && (localObject6 != localf3) && (localObject5 != null))
          if (localObject5 == localf3)
          {
            localObject5 = null;
            localObject3 = localObject6.iD[j];
            localObject9 = ((e)localObject3).hE;
            localh = localObject4.iD[(j + 1)].hE;
            localObject1 = null;
            i4 = ((e)localObject3).aH();
            n = localObject6.iD[(j + 1)].aH();
            if (localObject5 != null)
            {
              localObject8 = localObject5.iD[j];
              localObject3 = ((e)localObject8).hE;
              if (((e)localObject8).hy != null)
              {
                localObject1 = ((e)localObject8).hy.hE;
                label2404: localObject7 = localObject1;
                localObject1 = localObject8;
                label2412: i2 = n;
                if (localObject1 != null)
                  i2 = n + ((e)localObject1).aH();
                n = i4;
                if (localObject4 != null)
                  n = i4 + localObject4.iD[(j + 1)].aH();
                i4 = 4;
                if (i1 != 0)
                  i4 = 6;
                localObject1 = localObject5;
                if (localObject9 != null)
                {
                  localObject1 = localObject5;
                  if (localh != null)
                  {
                    localObject1 = localObject5;
                    if (localObject3 != null)
                    {
                      localObject1 = localObject5;
                      if (localObject7 != null)
                        parame.a((h)localObject9, localh, n, 0.5F, (h)localObject3, (h)localObject7, i2, i4);
                    }
                  }
                }
              }
            }
          }
        for (localObject1 = localObject5; ; localObject1 = localObject5)
        {
          if (((f)localObject6).iZ != 8);
          for (localObject5 = localObject6; ; localObject5 = localObject4)
          {
            localObject6 = localObject1;
            localObject4 = localObject5;
            break label2231;
            localObject1 = null;
            break label2404;
            localObject8 = localObject6.iD[(j + 1)].hy;
            if (localObject8 != null)
              localObject1 = ((e)localObject8).hE;
            localObject7 = localObject6.iD[(j + 1)].hE;
            localObject3 = localObject1;
            localObject1 = localObject8;
            break label2412;
            label2614: localObject5 = localObject2.iD[j];
            localObject4 = localf1.iD[j].hy;
            localObject1 = localf3.iD[(j + 1)];
            localObject6 = localf2.iD[(j + 1)].hy;
            if (localObject4 != null)
            {
              if (localObject2 == localf3)
                break label2734;
              parame.c(((e)localObject5).hE, ((e)localObject4).hE, ((e)localObject5).aH(), 5);
            }
            while (true)
            {
              if ((localObject6 == null) || (localObject2 == localf3))
                break label2777;
              parame.c(((e)localObject1).hE, ((e)localObject6).hE, -((e)localObject1).aH(), 5);
              break;
              label2734: if (localObject6 != null)
                parame.a(((e)localObject5).hE, ((e)localObject4).hE, ((e)localObject5).aH(), 0.5F, ((e)localObject1).hE, ((e)localObject6).hE, ((e)localObject1).aH(), 5);
            }
            label2777: break;
            label2779: localObject4 = null;
            break label1517;
            label2785: localObject5 = null;
            break label1535;
            label2791: localObject5 = null;
            break label1572;
            label2797: return;
            label2798: localObject1 = localf3;
            break label1627;
            label2805: localObject2 = localObject1;
            break label1601;
          }
          break label2307;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.c
 * JD-Core Version:    0.6.2
 */