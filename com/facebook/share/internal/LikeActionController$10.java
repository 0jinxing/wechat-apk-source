package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LikeActionController$10
  implements PlatformServiceClient.CompletedListener
{
  LikeActionController$10(LikeActionController paramLikeActionController)
  {
  }

  public void completed(Bundle paramBundle)
  {
    AppMethodBeat.i(96981);
    if ((paramBundle == null) || (!paramBundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")))
    {
      AppMethodBeat.o(96981);
      return;
    }
    boolean bool = paramBundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
    String str1;
    label47: String str2;
    label64: String str3;
    label81: String str4;
    if (paramBundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"))
    {
      str1 = paramBundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
      if (!paramBundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"))
        break label149;
      str2 = paramBundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
      if (!paramBundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"))
        break label161;
      str3 = paramBundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
      if (!paramBundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"))
        break label173;
      str4 = paramBundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
      label98: if (!paramBundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN"))
        break label185;
    }
    label149: label161: label173: label185: for (paramBundle = paramBundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN"); ; paramBundle = LikeActionController.access$1100(this.this$0))
    {
      LikeActionController.access$1300(this.this$0, bool, str1, str2, str3, str4, paramBundle);
      AppMethodBeat.o(96981);
      break;
      str1 = LikeActionController.access$700(this.this$0);
      break label47;
      str2 = LikeActionController.access$800(this.this$0);
      break label64;
      str3 = LikeActionController.access$900(this.this$0);
      break label81;
      str4 = LikeActionController.access$1000(this.this$0);
      break label98;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController.10
 * JD-Core Version:    0.6.2
 */