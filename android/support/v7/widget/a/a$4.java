package android.support.v7.widget.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.v;
import java.util.List;

final class a$4
  implements Runnable
{
  a$4(a parama, a.c paramc, int paramInt)
  {
  }

  public final void run()
  {
    if ((this.avH.aiB != null) && (this.avH.aiB.isAttachedToWindow()) && (!this.avK.avZ) && (this.avK.aoM.kj() != -1))
    {
      Object localObject = this.avH.aiB.getItemAnimator();
      if ((localObject == null) || (!((RecyclerView.f)localObject).a(null)))
      {
        localObject = this.avH;
        int i = ((a)localObject).avx.size();
        j = 0;
        if (j >= i)
          break label136;
        if (((a.c)((a)localObject).avx.get(j)).Ag)
          break label130;
      }
    }
    label130: label136: for (int j = 1; ; j = 0)
    {
      if (j != 0)
        this.avH.aiB.post(this);
      return;
      j++;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.a.4
 * JD-Core Version:    0.6.2
 */