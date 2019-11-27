import { Reactions } from '@attach/attach-embeds-react'
​
export default () => (
  <Reactions properties={{
    'reactions:services': 'participants,videos,comments',
    'reactions:augmented-reality': true
  }} />
)
