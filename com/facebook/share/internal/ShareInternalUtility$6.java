package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.internal.Utility.Mapper;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Type;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.UUID;

final class ShareInternalUtility$6
  implements Utility.Mapper<ShareMedia, Bundle>
{
  ShareInternalUtility$6(UUID paramUUID, List paramList)
  {
  }

  public final Bundle apply(ShareMedia paramShareMedia)
  {
    AppMethodBeat.i(97268);
    NativeAppCallAttachmentStore.Attachment localAttachment = ShareInternalUtility.access$000(this.val$appCallId, paramShareMedia);
    this.val$attachments.add(localAttachment);
    Bundle localBundle = new Bundle();
    localBundle.putString("type", paramShareMedia.getMediaType().name());
    localBundle.putString("uri", localAttachment.getAttachmentUrl());
    AppMethodBeat.o(97268);
    return localBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.6
 * JD-Core Version:    0.6.2
 */