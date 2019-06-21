package android.support.v7.widget;

import android.view.View;

final class bi
{
  final bi.b auR;
  bi.a auS;

  bi(bi.b paramb)
  {
    this.auR = paramb;
    this.auS = new bi.a();
  }

  final boolean bV(View paramView)
  {
    this.auS.setBounds(this.auR.jY(), this.auR.jZ(), this.auR.bF(paramView), this.auR.bG(paramView));
    this.auS.auT = 0;
    this.auS.addFlags(24579);
    return this.auS.lx();
  }

  final View k(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.auR.jY();
    int j = this.auR.jZ();
    if (paramInt2 > paramInt1);
    Object localObject;
    View localView;
    for (int k = 1; ; k = -1)
    {
      localObject = null;
      if (paramInt1 == paramInt2)
        break label178;
      localView = this.auR.getChildAt(paramInt1);
      int m = this.auR.bF(localView);
      int n = this.auR.bG(localView);
      this.auS.setBounds(i, j, m, n);
      if (paramInt3 == 0)
        break;
      this.auS.auT = 0;
      this.auS.addFlags(paramInt3);
      if (!this.auS.lx())
        break;
      localObject = localView;
      label125: return localObject;
    }
    if (paramInt4 != 0)
    {
      this.auS.auT = 0;
      this.auS.addFlags(paramInt4);
      if (this.auS.lx())
        localObject = localView;
    }
    while (true)
    {
      paramInt1 += k;
      break;
      label178: break label125;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bi
 * JD-Core Version:    0.6.2
 */