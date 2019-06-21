package android.support.constraint.a.a;

import java.util.ArrayList;

public final class d
{
  protected f hf;
  protected f hg;
  protected f hh;
  protected f hi;
  protected f hj;
  protected f hk;
  protected f hl;
  protected ArrayList<f> hm;
  protected int hn;
  protected int ho;
  protected float hp = 0.0F;
  private boolean hq = false;
  protected boolean hr;
  protected boolean hs;
  protected boolean ht;
  boolean hu;
  private int mOrientation;

  public d(f paramf, int paramInt, boolean paramBoolean)
  {
    this.hf = paramf;
    this.mOrientation = paramInt;
    this.hq = paramBoolean;
  }

  final void aF()
  {
    boolean bool = true;
    int i = this.mOrientation * 2;
    Object localObject1 = this.hf;
    Object localObject2 = this.hf;
    int j = 0;
    while (j == 0)
    {
      this.hn += 1;
      ((f)localObject2).jm[this.mOrientation] = null;
      ((f)localObject2).jl[this.mOrientation] = null;
      int k;
      if (((f)localObject2).iZ != 8)
      {
        if (this.hg == null)
          this.hg = ((f)localObject2);
        this.hi = ((f)localObject2);
        if ((localObject2.iF[this.mOrientation] == f.a.js) && ((localObject2.ie[this.mOrientation] == 0) || (localObject2.ie[this.mOrientation] == 3) || (localObject2.ie[this.mOrientation] == 2)))
        {
          this.ho += 1;
          float f = localObject2.jk[this.mOrientation];
          if (f > 0.0F)
            this.hp += localObject2.jk[this.mOrientation];
          k = this.mOrientation;
          if ((((f)localObject2).iZ == 8) || (localObject2.iF[k] != f.a.js) || ((localObject2.ie[k] != 0) && (localObject2.ie[k] != 3)))
            break label428;
          k = 1;
          label250: if (k != 0)
          {
            if (f >= 0.0F)
              break label434;
            this.hr = true;
            if (this.hm == null)
              this.hm = new ArrayList();
            this.hm.add(localObject2);
          }
          label267: if (this.hk == null)
            this.hk = ((f)localObject2);
          if (this.hl != null)
            this.hl.jl[this.mOrientation] = localObject2;
          this.hl = ((f)localObject2);
        }
      }
      if (localObject1 != localObject2)
        ((f)localObject1).jm[this.mOrientation] = localObject2;
      localObject1 = localObject2.iD[(i + 1)].hy;
      Object localObject3;
      if (localObject1 != null)
      {
        localObject3 = ((e)localObject1).hw;
        if (localObject3.iD[i].hy != null)
        {
          localObject1 = localObject3;
          if (localObject3.iD[i].hy.hw == localObject2)
            break label411;
        }
      }
      for (localObject1 = null; ; localObject1 = null)
      {
        label411: if (localObject1 == null)
          break label447;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        label428: k = 0;
        break label250;
        label434: this.hs = true;
        break label267;
      }
      label447: j = 1;
      localObject1 = localObject2;
    }
    this.hh = ((f)localObject2);
    if ((this.mOrientation == 0) && (this.hq))
    {
      this.hj = this.hh;
      if ((!this.hs) || (!this.hr))
        break label515;
    }
    while (true)
    {
      this.ht = bool;
      return;
      this.hj = this.hf;
      break;
      label515: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.d
 * JD-Core Version:    0.6.2
 */