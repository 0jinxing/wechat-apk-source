package com.tencent.mm.ui.chatting.c;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.view.AvatarImageView;
import com.tencent.mm.ui.chatting.viewitems.ay;
import java.lang.ref.WeakReference;

final class al$3
  implements Runnable
{
  al$3(al paramal, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31722);
    for (int i = 0; i < al.i(this.ySq).size(); i++)
    {
      AvatarImageView localAvatarImageView = (AvatarImageView)((WeakReference)al.i(this.ySq).valueAt(i)).get();
      if (localAvatarImageView != null)
      {
        Object localObject = localAvatarImageView.getTag();
        if (((localObject instanceof ay)) && (this.eiH.equals(((ay)localObject).userName)))
        {
          localAvatarImageView.dk(((ay)localObject).userName, 5);
          localAvatarImageView.setShowStoryHint(this.ySr);
        }
      }
    }
    AppMethodBeat.o(31722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.al.3
 * JD-Core Version:    0.6.2
 */