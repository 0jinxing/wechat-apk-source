package com.facebook.share.internal;

import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.internal.Utility.Mapper;
import com.facebook.share.model.SharePhoto;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.UUID;

final class ShareInternalUtility$4
  implements Utility.Mapper<SharePhoto, NativeAppCallAttachmentStore.Attachment>
{
  ShareInternalUtility$4(UUID paramUUID)
  {
  }

  public final NativeAppCallAttachmentStore.Attachment apply(SharePhoto paramSharePhoto)
  {
    AppMethodBeat.i(97264);
    paramSharePhoto = ShareInternalUtility.access$000(this.val$appCallId, paramSharePhoto);
    AppMethodBeat.o(97264);
    return paramSharePhoto;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.4
 * JD-Core Version:    0.6.2
 */