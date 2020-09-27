package com.himanshucodes.gappein.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.gappein.sdk.client.ChatClient
import com.gappein.sdk.model.Channel
import com.gappein.sdk.util.toChannelList

@Composable
fun ChannelList() {
    ChatClient.getInstance().getAllChannels { channel ->
        LazyColumnFor(channel, modifier = Modifier, itemContent = {
            channelList(it)
        })
    }
}

@Composable
private fun channelList(channel: Channel) {
    Row(Modifier.padding(16.dp)) {

    }
}

@Preview
@Composable
fun check() {
    val channel = Channel()
    channel.toChannelList {

    }
}
