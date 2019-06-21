package android.support.constraint.a.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class h
{
  public boolean jL = false;
  public List<f> jP;
  int jQ = -1;
  int jR = -1;
  public final int[] jS = { this.jQ, this.jR };
  List<f> jT = new ArrayList();
  List<f> jU = new ArrayList();
  HashSet<f> jV = new HashSet();
  HashSet<f> jW = new HashSet();
  List<f> jX = new ArrayList();
  List<f> jY = new ArrayList();

  h(List<f> paramList)
  {
    this.jP = paramList;
  }

  h(List<f> paramList, byte paramByte)
  {
    this.jP = paramList;
    this.jL = true;
  }

  final Set<f> A(int paramInt)
  {
    HashSet localHashSet;
    if (paramInt == 0)
      localHashSet = this.jV;
    while (true)
    {
      return localHashSet;
      if (paramInt == 1)
        localHashSet = this.jW;
      else
        localHashSet = null;
    }
  }

  final void a(ArrayList<f> paramArrayList, f paramf)
  {
    if (paramf.jf);
    while (true)
    {
      return;
      paramArrayList.add(paramf);
      paramf.jf = true;
      if (!paramf.aL())
      {
        Object localObject;
        if ((paramf instanceof j))
        {
          localObject = (j)paramf;
          i = ((j)localObject).hn;
          for (j = 0; j < i; j++)
            a(paramArrayList, localObject.kh[j]);
        }
        int i = paramf.iD.length;
        for (int j = 0; j < i; j++)
        {
          e locale = paramf.iD[j].hy;
          if (locale != null)
          {
            localObject = locale.hw;
            if ((locale != null) && (localObject != paramf.iG))
              a(paramArrayList, (f)localObject);
          }
        }
      }
    }
  }

  final void c(f paramf, int paramInt)
  {
    if (paramInt == 0)
      this.jV.add(paramf);
    while (true)
    {
      return;
      if (paramInt == 1)
        this.jW.add(paramf);
    }
  }

  final void d(f paramf)
  {
    if ((!paramf.jd) || (paramf.aL()))
      return;
    int i;
    label27: e locale;
    label39: int j;
    if (paramf.ix.hy != null)
    {
      i = 1;
      if (i == 0)
        break label209;
      locale = paramf.ix.hy;
      if (locale == null)
        break label436;
      if (!locale.hw.je)
        d(locale.hw);
      if (locale.hx != e.c.hQ)
        break label220;
      j = locale.hw.iJ;
      j = locale.hw.getWidth() + j;
    }
    while (true)
    {
      label92: if (i != 0)
        j -= paramf.ix.aH();
      while (true)
      {
        paramf.g(j - paramf.getWidth(), j);
        if (paramf.iz.hy == null)
          break label262;
        locale = paramf.iz.hy;
        if (!locale.hw.je)
          d(locale.hw);
        j = locale.hw.iK;
        j = locale.hw.iR + j - paramf.iR;
        paramf.h(j, paramf.mHeight + j);
        paramf.je = true;
        break;
        i = 0;
        break label27;
        label209: locale = paramf.iu.hy;
        break label39;
        label220: if (locale.hx != e.c.hO)
          break label436;
        j = locale.hw.iJ;
        break label92;
        j += paramf.iu.aH() + paramf.getWidth();
      }
      label262: int k;
      if (paramf.iy.hy != null)
      {
        k = 1;
        label275: if (k == 0)
          break label382;
        locale = paramf.iy.hy;
        label288: i = j;
        if (locale != null)
        {
          if (!locale.hw.je)
            d(locale.hw);
          if (locale.hx != e.c.hR)
            break label393;
          i = locale.hw.iK + locale.hw.getHeight();
        }
        label339: if (k == 0)
          break label417;
      }
      label393: label417: for (j = i - paramf.iy.aH(); ; j = i + (paramf.iw.aH() + paramf.getHeight()))
      {
        paramf.h(j - paramf.getHeight(), j);
        paramf.je = true;
        break;
        k = 0;
        break label275;
        label382: locale = paramf.iw.hy;
        break label288;
        i = j;
        if (locale.hx != e.c.hP)
          break label339;
        i = locale.hw.iK;
        break label339;
      }
      label436: j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.h
 * JD-Core Version:    0.6.2
 */